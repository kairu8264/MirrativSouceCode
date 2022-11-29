package ai;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class zt1 implements av1 {

    /* renamed from: f  reason: collision with root package name */
    public static final Pattern f13161f = Pattern.compile("Received error HTTP response code: (.*)");

    /* renamed from: a  reason: collision with root package name */
    public final zs1 f13162a;

    /* renamed from: b  reason: collision with root package name */
    public final t43 f13163b;

    /* renamed from: c  reason: collision with root package name */
    public final yl2 f13164c;

    /* renamed from: d  reason: collision with root package name */
    public final ScheduledExecutorService f13165d;

    /* renamed from: e  reason: collision with root package name */
    public final hx1 f13166e;

    public zt1(yl2 yl2Var, zs1 zs1Var, t43 t43Var, ScheduledExecutorService scheduledExecutorService, hx1 hx1Var) {
        this.f13164c = yl2Var;
        this.f13162a = zs1Var;
        this.f13163b = t43Var;
        this.f13165d = scheduledExecutorService;
        this.f13166e = hx1Var;
    }

    @Override // ai.av1
    public final s43<sl2> a(ie0 ie0Var) {
        s43<sl2> i10 = j43.i(this.f13162a.a(ie0Var), new p33(this) { // from class: ai.wt1

            /* renamed from: a  reason: collision with root package name */
            public final zt1 f11748a;

            {
                this.f11748a = this;
            }

            @Override // ai.p33
            public final s43 a(Object obj) {
                return this.f11748a.d((InputStream) obj);
            }
        }, this.f13163b);
        if (((Boolean) ft.c().c(ox.O3)).booleanValue()) {
            i10 = j43.g(j43.h(i10, ((Integer) ft.c().c(ox.P3)).intValue(), TimeUnit.SECONDS, this.f13165d), TimeoutException.class, xt1.f12311a, hk0.f4883f);
        }
        j43.p(i10, new yt1(this), hk0.f4883f);
        return i10;
    }

    public final /* synthetic */ s43 d(InputStream inputStream) throws Exception {
        return j43.a(new sl2(new pl2(this.f13164c), rl2.a(new InputStreamReader(inputStream))));
    }
}
