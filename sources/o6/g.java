package o6;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PostProcessor;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import android.os.Build;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class g {

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f44087a;

        static {
            int[] iArr = new int[m6.b.values().length];
            iArr[m6.b.UNCHANGED.ordinal()] = 1;
            iArr[m6.b.TRANSLUCENT.ordinal()] = 2;
            iArr[m6.b.OPAQUE.ordinal()] = 3;
            f44087a = iArr;
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends Animatable2.AnimationCallback {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f44088a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f44089b;

        public b(io.a<wn.v> aVar, io.a<wn.v> aVar2) {
            this.f44088a = aVar;
            this.f44089b = aVar2;
        }

        @Override // android.graphics.drawable.Animatable2.AnimationCallback
        public void onAnimationEnd(Drawable drawable) {
            io.a<wn.v> aVar = this.f44089b;
            if (aVar == null) {
                return;
            }
            aVar.invoke();
        }

        @Override // android.graphics.drawable.Animatable2.AnimationCallback
        public void onAnimationStart(Drawable drawable) {
            io.a<wn.v> aVar = this.f44088a;
            if (aVar == null) {
                return;
            }
            aVar.invoke();
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends h5.b {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f44090a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ io.a<wn.v> f44091b;

        public c(io.a<wn.v> aVar, io.a<wn.v> aVar2) {
            this.f44090a = aVar;
            this.f44091b = aVar2;
        }

        @Override // h5.b
        public void a(Drawable drawable) {
            io.a<wn.v> aVar = this.f44091b;
            if (aVar == null) {
                return;
            }
            aVar.invoke();
        }

        @Override // h5.b
        public void b(Drawable drawable) {
            io.a<wn.v> aVar = this.f44090a;
            if (aVar == null) {
                return;
            }
            aVar.invoke();
        }
    }

    public static final Animatable2.AnimationCallback b(io.a<wn.v> aVar, io.a<wn.v> aVar2) {
        return new b(aVar, aVar2);
    }

    public static final h5.b c(io.a<wn.v> aVar, io.a<wn.v> aVar2) {
        return new c(aVar, aVar2);
    }

    public static final PostProcessor d(final m6.a aVar) {
        return new PostProcessor() { // from class: o6.f
            @Override // android.graphics.PostProcessor
            public final int onPostProcess(Canvas canvas) {
                int e10;
                e10 = g.e(m6.a.this, canvas);
                return e10;
            }
        };
    }

    public static final int e(m6.a aVar, Canvas canvas) {
        return f(aVar.a(canvas));
    }

    public static final int f(m6.b bVar) {
        int i10 = a.f44087a[bVar.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    return -1;
                }
                throw new NoWhenBranchMatchedException();
            }
            return -3;
        }
        return 0;
    }

    public static final boolean g(Bitmap.Config config) {
        return Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE;
    }
}
