package in;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* loaded from: classes4.dex */
public class s {

    /* renamed from: a  reason: collision with root package name */
    public final Context f36935a;

    /* renamed from: b  reason: collision with root package name */
    public final h f36936b;

    /* renamed from: c  reason: collision with root package name */
    public final q f36937c;

    /* renamed from: d  reason: collision with root package name */
    public final ExecutorService f36938d;

    /* renamed from: e  reason: collision with root package name */
    public final Boolean f36939e;

    /* loaded from: classes4.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public final Context f36940a;

        /* renamed from: b  reason: collision with root package name */
        public h f36941b;

        /* renamed from: c  reason: collision with root package name */
        public q f36942c;

        /* renamed from: d  reason: collision with root package name */
        public ExecutorService f36943d;

        /* renamed from: e  reason: collision with root package name */
        public Boolean f36944e;

        public b(Context context) {
            if (context != null) {
                this.f36940a = context.getApplicationContext();
                return;
            }
            throw new IllegalArgumentException("Context must not be null.");
        }

        public s a() {
            return new s(this.f36940a, this.f36941b, this.f36942c, this.f36943d, this.f36944e);
        }

        public b b(q qVar) {
            if (qVar != null) {
                this.f36942c = qVar;
                return this;
            }
            throw new IllegalArgumentException("TwitterAuthConfig must not be null.");
        }
    }

    public s(Context context, h hVar, q qVar, ExecutorService executorService, Boolean bool) {
        this.f36935a = context;
        this.f36936b = hVar;
        this.f36937c = qVar;
        this.f36938d = executorService;
        this.f36939e = bool;
    }
}
