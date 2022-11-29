package ai;

import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class e53<V> extends y33<V> {
    public s43<V> D;
    public ScheduledFuture<?> E;

    public e53(s43<V> s43Var) {
        Objects.requireNonNull(s43Var);
        this.D = s43Var;
    }

    public static <V> s43<V> I(s43<V> s43Var, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        e53 e53Var = new e53(s43Var);
        b53 b53Var = new b53(e53Var);
        e53Var.E = scheduledExecutorService.schedule(b53Var, j10, timeUnit);
        s43Var.c(b53Var, w33.INSTANCE);
        return e53Var;
    }

    @Override // ai.a33
    public final String h() {
        s43<V> s43Var = this.D;
        ScheduledFuture<?> scheduledFuture = this.E;
        if (s43Var != null) {
            String obj = s43Var.toString();
            StringBuilder sb2 = new StringBuilder(obj.length() + 14);
            sb2.append("inputFuture=[");
            sb2.append(obj);
            sb2.append("]");
            String sb3 = sb2.toString();
            if (scheduledFuture != null) {
                long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
                if (delay > 0) {
                    StringBuilder sb4 = new StringBuilder(sb3.length() + 43);
                    sb4.append(sb3);
                    sb4.append(", remaining delay=[");
                    sb4.append(delay);
                    sb4.append(" ms]");
                    return sb4.toString();
                }
                return sb3;
            }
            return sb3;
        }
        return null;
    }

    @Override // ai.a33
    public final void j() {
        z(this.D);
        ScheduledFuture<?> scheduledFuture = this.E;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.D = null;
        this.E = null;
    }
}
