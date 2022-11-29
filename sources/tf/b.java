package tf;

import android.os.Handler;
import android.os.Looper;
import jo.q;
import wn.f;
import wn.g;
import wn.i;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final f f53617a = g.b(i.NONE, a.f53618w);

    /* loaded from: classes3.dex */
    public static final class a extends q implements io.a<Handler> {

        /* renamed from: w  reason: collision with root package name */
        public static final a f53618w = new a();

        public a() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    public static final Handler b() {
        return (Handler) f53617a.getValue();
    }
}
