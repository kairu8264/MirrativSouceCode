package ai;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes3.dex */
public final class fn3 extends in3 {

    /* renamed from: a  reason: collision with root package name */
    public final Logger f4141a;

    public fn3(String str) {
        this.f4141a = Logger.getLogger(str);
    }

    @Override // ai.in3
    public final void a(String str) {
        this.f4141a.logp(Level.FINE, "com.googlecode.mp4parser.util.JuliLogger", "logDebug", str);
    }
}
