
import ch.qos.logback.classic.encoder.PatternLayoutEncoder
import ch.qos.logback.core.ConsoleAppender

import static ch.qos.logback.classic.Level.DEBUG
import static ch.qos.logback.classic.Level.INFO
import static ch.qos.logback.classic.Level.WARN

appender("STDOUT", ConsoleAppender) {
	encoder(PatternLayoutEncoder) { pattern = "%d{HH:mm:ss.SSS} [%thread] %-5level %logger{5} Groovy - %msg%n" }
}

logger("com.leohart", WARN)

root(WARN, ["STDOUT"])
