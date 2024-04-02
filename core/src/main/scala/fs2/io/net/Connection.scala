package fs2
package io
package net

trait Connection[F[_]] {
  def socket: Socket[F[_]]
}
