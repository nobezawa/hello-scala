package model

/**
 * Created by nobesawa on 2014/10/14.
 */
trait TicketStatus {}
object TicketStatus {
  case object Open extends TicketStatus
  case object Fixed extends TicketStatus

  def of(status: String): Option[TicketStatus] = {
    status.toLowerCase match {
      case "open" => Option(Open)
      case "fixed" => Option(Fixed)
      case _ => None
    }
  }
}
