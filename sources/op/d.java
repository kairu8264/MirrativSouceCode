package op;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import jo.p;

/* loaded from: classes4.dex */
public final class d extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public static final d f45497a = new d();

    @Override // java.util.logging.Handler
    public void close() {
    }

    @Override // java.util.logging.Handler
    public void flush() {
    }

    @Override // java.util.logging.Handler
    public void publish(LogRecord logRecord) {
        int b10;
        p.h(logRecord, "record");
        c cVar = c.f45496c;
        String loggerName = logRecord.getLoggerName();
        p.g(loggerName, "record.loggerName");
        b10 = e.b(logRecord);
        String message = logRecord.getMessage();
        p.g(message, "record.message");
        cVar.a(loggerName, b10, message, logRecord.getThrown());
    }
}
