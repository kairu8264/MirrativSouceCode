package c6;

import a6.f;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Movie;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import jo.h;
import jo.p;
import k6.g;
import po.n;

/* loaded from: classes.dex */
public final class b extends Drawable implements Animatable {
    public static final a S = new a(null);
    public Canvas D;
    public Bitmap E;
    public float H;
    public float I;
    public boolean J;
    public long K;
    public long L;
    public int N;
    public m6.a O;
    public Picture P;
    public boolean R;

    /* renamed from: w  reason: collision with root package name */
    public final Movie f18843w;

    /* renamed from: x  reason: collision with root package name */
    public final Bitmap.Config f18844x;

    /* renamed from: y  reason: collision with root package name */
    public final g f18845y;

    /* renamed from: z  reason: collision with root package name */
    public final Paint f18846z = new Paint(3);
    public final List<h5.b> A = new ArrayList();
    public final Rect B = new Rect();
    public final Rect C = new Rect();
    public float F = 1.0f;
    public float G = 1.0f;
    public int M = -1;
    public m6.b Q = m6.b.UNCHANGED;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    public b(Movie movie, Bitmap.Config config, g gVar) {
        this.f18843w = movie;
        this.f18844x = config;
        this.f18845y = gVar;
        if (!(!o6.g.g(config))) {
            throw new IllegalArgumentException("Bitmap config must not be hardware.".toString());
        }
    }

    public final void a(Canvas canvas) {
        Canvas canvas2 = this.D;
        Bitmap bitmap = this.E;
        if (canvas2 == null || bitmap == null) {
            return;
        }
        canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
        int save = canvas2.save();
        try {
            float f10 = this.F;
            canvas2.scale(f10, f10);
            this.f18843w.draw(canvas2, 0.0f, 0.0f, this.f18846z);
            Picture picture = this.P;
            if (picture != null) {
                picture.draw(canvas2);
            }
            canvas2.restoreToCount(save);
            int save2 = canvas.save();
            try {
                canvas.translate(this.H, this.I);
                float f11 = this.G;
                canvas.scale(f11, f11);
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.f18846z);
            } finally {
                canvas.restoreToCount(save2);
            }
        } catch (Throwable th2) {
            canvas2.restoreToCount(save);
            throw th2;
        }
    }

    public final Rect b(Canvas canvas) {
        Rect rect = this.C;
        rect.set(0, 0, canvas.getWidth(), canvas.getHeight());
        return rect;
    }

    public void c(h5.b bVar) {
        this.A.add(bVar);
    }

    public final void d(m6.a aVar) {
        this.O = aVar;
        if (aVar != null && this.f18843w.width() > 0 && this.f18843w.height() > 0) {
            Picture picture = new Picture();
            this.Q = aVar.a(picture.beginRecording(this.f18843w.width(), this.f18843w.height()));
            picture.endRecording();
            this.P = picture;
            this.R = true;
        } else {
            this.P = null;
            this.Q = m6.b.UNCHANGED;
            this.R = false;
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean g10 = g();
        if (this.R) {
            f(b(canvas));
            int save = canvas.save();
            try {
                float f10 = 1 / this.F;
                canvas.scale(f10, f10);
                a(canvas);
            } finally {
                canvas.restoreToCount(save);
            }
        } else {
            f(getBounds());
            a(canvas);
        }
        if (this.J && g10) {
            invalidateSelf();
        } else {
            stop();
        }
    }

    public final void e(int i10) {
        if (i10 >= -1) {
            this.M = i10;
            return;
        }
        throw new IllegalArgumentException(p.o("Invalid repeatCount: ", Integer.valueOf(i10)).toString());
    }

    public final void f(Rect rect) {
        if (p.c(this.B, rect)) {
            return;
        }
        this.B.set(rect);
        int width = rect.width();
        int height = rect.height();
        int width2 = this.f18843w.width();
        int height2 = this.f18843w.height();
        if (width2 <= 0 || height2 <= 0) {
            return;
        }
        double c10 = f.c(width2, height2, width, height, this.f18845y);
        if (!this.R) {
            c10 = n.g(c10, 1.0d);
        }
        float f10 = (float) c10;
        this.F = f10;
        int i10 = (int) (width2 * f10);
        int i11 = (int) (f10 * height2);
        Bitmap createBitmap = Bitmap.createBitmap(i10, i11, this.f18844x);
        p.g(createBitmap, "createBitmap(width, height, config)");
        Bitmap bitmap = this.E;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.E = createBitmap;
        this.D = new Canvas(createBitmap);
        if (this.R) {
            this.G = 1.0f;
            this.H = 0.0f;
            this.I = 0.0f;
            return;
        }
        float c11 = (float) f.c(i10, i11, width, height, this.f18845y);
        this.G = c11;
        float f11 = width - (i10 * c11);
        float f12 = 2;
        this.H = rect.left + (f11 / f12);
        this.I = rect.top + ((height - (c11 * i11)) / f12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean g() {
        boolean z10;
        int duration = this.f18843w.duration();
        int i10 = 0;
        if (duration == 0) {
            z10 = 0;
        } else {
            if (this.J) {
                this.L = SystemClock.uptimeMillis();
            }
            int i11 = (int) (this.L - this.K);
            int i12 = i11 / duration;
            this.N = i12;
            int i13 = this.M;
            i10 = (i13 == -1 || i12 <= i13) ? 1 : 1;
            if (i10 != 0) {
                duration = i11 - (i12 * duration);
            }
            int i14 = i10;
            i10 = duration;
            z10 = i14;
        }
        this.f18843w.setTime(i10);
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f18843w.height();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f18843w.width();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        m6.b bVar;
        return (this.f18846z.getAlpha() == 255 && ((bVar = this.Q) == m6.b.OPAQUE || (bVar == m6.b.UNCHANGED && this.f18843w.isOpaque()))) ? -1 : -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.J;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < 256) {
            z10 = true;
        }
        if (z10) {
            this.f18846z.setAlpha(i10);
            return;
        }
        throw new IllegalArgumentException(p.o("Invalid alpha: ", Integer.valueOf(i10)).toString());
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f18846z.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (this.J) {
            return;
        }
        this.J = true;
        this.N = 0;
        this.K = SystemClock.uptimeMillis();
        List<h5.b> list = this.A;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            list.get(i10).b(this);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (this.J) {
            this.J = false;
            List<h5.b> list = this.A;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                list.get(i10).a(this);
            }
        }
    }
}
