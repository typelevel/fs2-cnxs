# fs2-cnxs

Incubator for a high level, TCP based, connection oriented API for fs2.io.net. See https://github.com/typelevel/fs2/issues/3419 for details.


Specifically:
- Support both single and pooled connections.
- Health checking
- Proper idle/eof handling


## Examples usage of fs2 client sockets

Skunk's session and pool apis:
- `Session`: https://github.com/typelevel/skunk/blob/main/modules/core/shared/src/main/scala/Session.scala#L412-L431
- `Pool`: https://github.com/typelevel/skunk/blob/main/modules/core/shared/src/main/scala/util/Pool.scala#L48-L65

http4s:
- `EmberConnection`: https://github.com/http4s/http4s/blob/main/ember-client/shared/src/main/scala/org/http4s/ember/client/EmberConnection.scala#L27-L39


