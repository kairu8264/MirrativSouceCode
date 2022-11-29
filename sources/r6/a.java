package r6;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public abstract class a<Params, Result> {

    /* renamed from: r6.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class RunnableC0755a implements Runnable {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Object[] f49768w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ Handler f49769x;

        /* renamed from: r6.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public class RunnableC0756a implements Runnable {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ Object f49771w;

            public RunnableC0756a(Object obj) {
                this.f49771w = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                a.this.c(this.f49771w);
            }
        }

        public RunnableC0755a(Object[] objArr, Handler handler) {
            this.f49768w = objArr;
            this.f49769x = handler;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            this.f49769x.post(new RunnableC0756a(a.this.a(this.f49768w)));
        }
    }

    public abstract Result a(Params[] paramsArr);

    @SafeVarargs
    public final a<Params, Result> b(Params... paramsArr) {
        d();
        Executors.newSingleThreadExecutor().execute(new RunnableC0755a(paramsArr, new Handler(Looper.getMainLooper())));
        return this;
    }

    public void c(Result result) {
    }

    public void d() {
    }
}
