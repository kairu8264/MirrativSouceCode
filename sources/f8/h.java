package f8;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes.dex */
public final class h<Z> extends c<Z> {
    public static final Handler A = new Handler(Looper.getMainLooper(), new a());

    /* renamed from: z  reason: collision with root package name */
    public final com.bumptech.glide.k f31839z;

    /* loaded from: classes.dex */
    public class a implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 1) {
                ((h) message.obj).a();
                return true;
            }
            return false;
        }
    }

    public h(com.bumptech.glide.k kVar, int i10, int i11) {
        super(i10, i11);
        this.f31839z = kVar;
    }

    public static <Z> h<Z> c(com.bumptech.glide.k kVar, int i10, int i11) {
        return new h<>(kVar, i10, i11);
    }

    public void a() {
        this.f31839z.clear(this);
    }

    @Override // f8.j
    public void e(Z z10, g8.b<? super Z> bVar) {
        A.obtainMessage(1, this).sendToTarget();
    }

    @Override // f8.j
    public void g(Drawable drawable) {
    }
}
