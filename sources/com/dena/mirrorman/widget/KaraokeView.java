package com.dena.mirrorman.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.net.Uri;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import com.dena.mirrorman.widget.KaraokeView;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import jf.a0;
import jf.m;
import jf.v;
import jo.h;
import jo.p;

/* loaded from: classes3.dex */
public final class KaraokeView extends View {

    /* renamed from: b0  reason: collision with root package name */
    public static final a f26354b0 = new a(null);

    /* renamed from: c0  reason: collision with root package name */
    public static final int f26355c0 = 8;
    public c A;
    public b B;
    public List<a0> C;
    public float D;
    public int E;
    public a0 F;
    public a0 G;
    public a0 H;
    public a0 I;
    public int J;
    public final Paint K;
    public final Paint L;
    public final Paint M;
    public final Paint N;
    public final Paint O;
    public final Paint P;
    public final Paint Q;
    public final Paint R;
    public float S;
    public float T;
    public Bitmap U;
    public Canvas V;
    public Rect W;

    /* renamed from: a0  reason: collision with root package name */
    public RectF f26356a0;

    /* renamed from: w  reason: collision with root package name */
    public v f26357w;

    /* renamed from: x  reason: collision with root package name */
    public MediaPlayer f26358x;

    /* renamed from: y  reason: collision with root package name */
    public String f26359y;

    /* renamed from: z  reason: collision with root package name */
    public AtomicBoolean f26360z;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    /* loaded from: classes3.dex */
    public interface b {
        void a(int i10);

        void b();
    }

    /* loaded from: classes3.dex */
    public final class c extends Thread {
        public c() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            long currentTimeMillis = System.currentTimeMillis() + 16;
            MediaPlayer mediaPlayer = KaraokeView.this.f26358x;
            if (mediaPlayer != null) {
                KaraokeView karaokeView = KaraokeView.this;
                while (karaokeView.f26360z.get()) {
                    try {
                        if (System.currentTimeMillis() >= currentTimeMillis) {
                            b bVar = karaokeView.B;
                            if (bVar != null) {
                                bVar.a(mediaPlayer.getCurrentPosition());
                            }
                            karaokeView.i(mediaPlayer.getCurrentPosition());
                            currentTimeMillis = System.currentTimeMillis() + 16;
                        }
                        Thread.sleep(16L);
                    } catch (Exception e10) {
                        g9.a.c(e10);
                        interrupt();
                    }
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KaraokeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        p.h(context, "context");
        this.f26359y = "";
        this.f26360z = new AtomicBoolean(false);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        paint.setFakeBoldText(true);
        this.K = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setColor(-16777216);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(7.0f);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        paint2.setFakeBoldText(true);
        this.L = paint2;
        Paint paint3 = new Paint();
        paint3.setAntiAlias(true);
        paint3.setColor(-65536);
        paint3.setStyle(Paint.Style.FILL);
        paint3.setFakeBoldText(true);
        this.M = paint3;
        Paint paint4 = new Paint();
        paint4.setAntiAlias(true);
        paint4.setColor(-1);
        paint4.setStyle(Paint.Style.STROKE);
        paint4.setStrokeWidth(7.0f);
        paint4.setStrokeJoin(Paint.Join.ROUND);
        paint4.setFakeBoldText(true);
        this.N = paint4;
        Paint paint5 = new Paint();
        paint5.setAntiAlias(true);
        paint5.setColor(-1);
        paint5.setStyle(Paint.Style.FILL);
        paint5.setFakeBoldText(true);
        this.O = paint5;
        Paint paint6 = new Paint();
        paint6.setAntiAlias(true);
        paint6.setColor(-16777216);
        paint6.setStyle(Paint.Style.STROKE);
        paint6.setStrokeWidth(7.0f);
        paint6.setStrokeJoin(Paint.Join.ROUND);
        paint6.setFakeBoldText(true);
        this.P = paint6;
        Paint paint7 = new Paint();
        paint7.setAntiAlias(true);
        paint7.setColor(-65536);
        paint7.setStyle(Paint.Style.FILL);
        paint7.setFakeBoldText(true);
        this.Q = paint7;
        Paint paint8 = new Paint();
        paint8.setAntiAlias(true);
        paint8.setColor(-1);
        paint8.setStyle(Paint.Style.STROKE);
        paint8.setStrokeWidth(7.0f);
        paint8.setStrokeJoin(Paint.Join.ROUND);
        paint8.setFakeBoldText(true);
        this.R = paint8;
        this.S = 1.0f;
        this.T = 1.0f;
        this.V = new Canvas();
    }

    private final Bitmap getBufferBitmap() {
        Bitmap createBitmap = Bitmap.createBitmap(960, 360, Bitmap.Config.ARGB_8888);
        p.g(createBitmap, "createBitmap(BASE_WIDTH,… Bitmap.Config.ARGB_8888)");
        return createBitmap;
    }

    public static final void j(KaraokeView karaokeView, int i10) {
        a0 a0Var;
        a0 a0Var2;
        p.h(karaokeView, "this$0");
        List<a0> list = karaokeView.C;
        List<a0> list2 = null;
        if (list == null) {
            p.v("lyricsList");
            list = null;
        }
        int i11 = 0;
        for (a0 a0Var3 : list) {
            int i12 = i11 + 1;
            if (a0Var3.l(i10) && !p.c(karaokeView.G, a0Var3)) {
                karaokeView.F = karaokeView.G;
                karaokeView.G = a0Var3;
                List<a0> list3 = karaokeView.C;
                if (list3 == null) {
                    p.v("lyricsList");
                    list3 = null;
                }
                int i13 = i11 + 2;
                if (list3.size() > i13) {
                    List<a0> list4 = karaokeView.C;
                    if (list4 == null) {
                        p.v("lyricsList");
                        list4 = null;
                    }
                    a0Var = list4.get(i13);
                } else {
                    a0Var = null;
                }
                karaokeView.I = a0Var;
                List<a0> list5 = karaokeView.C;
                if (list5 == null) {
                    p.v("lyricsList");
                    list5 = null;
                }
                if (list5.size() != i12) {
                    List<a0> list6 = karaokeView.C;
                    if (list6 == null) {
                        p.v("lyricsList");
                        list6 = null;
                    }
                    a0Var2 = list6.get(i12);
                } else {
                    a0Var2 = null;
                }
                karaokeView.H = a0Var2;
                karaokeView.D = karaokeView.m(1);
            }
            i11 = i12;
        }
        List<a0> list7 = karaokeView.C;
        if (list7 == null) {
            p.v("lyricsList");
            list7 = null;
        }
        if (i10 <= ((a0) xn.a0.X(list7)).i()) {
            List<a0> list8 = karaokeView.C;
            if (list8 == null) {
                p.v("lyricsList");
                list8 = null;
            }
            karaokeView.G = list8.get(0);
            List<a0> list9 = karaokeView.C;
            if (list9 == null) {
                p.v("lyricsList");
                list9 = null;
            }
            karaokeView.H = list9.get(1);
            List<a0> list10 = karaokeView.C;
            if (list10 == null) {
                p.v("lyricsList");
            } else {
                list2 = list10;
            }
            karaokeView.I = list2.get(2);
        } else {
            List<a0> list11 = karaokeView.C;
            if (list11 == null) {
                p.v("lyricsList");
                list11 = null;
            }
            if (i10 >= ((a0) xn.a0.i0(list11)).d()) {
                List<a0> list12 = karaokeView.C;
                if (list12 == null) {
                    p.v("lyricsList");
                    list12 = null;
                }
                karaokeView.F = (a0) xn.a0.i0(list12);
                karaokeView.G = null;
            }
        }
        karaokeView.invalidate();
    }

    public static final void s(final KaraokeView karaokeView, MediaPlayer mediaPlayer) {
        p.h(karaokeView, "this$0");
        mediaPlayer.setPlaybackParams(karaokeView.k(karaokeView.S, karaokeView.T));
        mediaPlayer.seekTo(0);
        mediaPlayer.start();
        mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: sf.c
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer2) {
                KaraokeView.t(KaraokeView.this, mediaPlayer2);
            }
        });
        karaokeView.u();
    }

    private final void setPitch(float f10) {
        MediaPlayer mediaPlayer;
        g9.a.g("setPitch(): " + f10);
        this.T = f10;
        if (!this.f26360z.get() || (mediaPlayer = this.f26358x) == null) {
            return;
        }
        mediaPlayer.setPlaybackParams(k(this.S, f10));
    }

    private final void setSpeed(float f10) {
        MediaPlayer mediaPlayer;
        g9.a.g("setSpeed(): " + f10);
        this.S = f10;
        if (!this.f26360z.get() || (mediaPlayer = this.f26358x) == null) {
            return;
        }
        mediaPlayer.setPlaybackParams(k(f10, this.T));
    }

    public static final void t(KaraokeView karaokeView, MediaPlayer mediaPlayer) {
        p.h(karaokeView, "this$0");
        b bVar = karaokeView.B;
        if (bVar != null) {
            bVar.b();
        }
    }

    public final float getSpeed() {
        return this.S;
    }

    public final void h() {
        this.K.setTextSize(38.0f);
        this.L.setTextSize(38.0f);
        this.M.setTextSize(38.0f);
        this.N.setTextSize(38.0f);
        this.O.setTextSize(12.0f);
        this.P.setTextSize(12.0f);
        this.Q.setTextSize(12.0f);
        this.R.setTextSize(12.0f);
        this.W = new Rect(0, 0, 960, 360);
        this.f26356a0 = new RectF(0.0f, 0.0f, getWidth(), getHeight());
    }

    public final void i(final int i10) {
        this.E = i10;
        Handler handler = getHandler();
        if (handler != null) {
            handler.post(new Runnable() { // from class: sf.e
                @Override // java.lang.Runnable
                public final void run() {
                    KaraokeView.j(KaraokeView.this, i10);
                }
            });
        }
    }

    public final PlaybackParams k(float f10, float f11) {
        PlaybackParams playbackParams = new PlaybackParams();
        playbackParams.setSpeed(f10);
        playbackParams.setPitch(f11);
        return playbackParams;
    }

    public final Bitmap l(int i10, String str, float f10, Paint paint, float f11) {
        Bitmap createBitmap = Bitmap.createBitmap((int) f11, i10, Bitmap.Config.ARGB_8888);
        new Canvas(createBitmap).drawText(str, paint.getStrokeWidth(), f10, paint);
        p.g(createBitmap, "createBitmap(parWidth.to…offsetY, paint)\n        }");
        return createBitmap;
    }

    public final float m(int i10) {
        if (i10 == 0 || i10 == 1 || i10 == 2 || i10 == 3) {
            return ((i10 * 0.33f) - 0.1f) * 360;
        }
        return -180.0f;
    }

    public final void n() {
        List<a0> a10;
        this.D = 0.0f;
        this.E = 0;
        v vVar = this.f26357w;
        if (vVar != null && (a10 = vVar.a()) != null) {
            this.C = a10;
        }
        this.F = null;
        this.G = null;
        this.H = null;
        this.I = null;
        this.f26358x = new MediaPlayer();
    }

    public final void o(Canvas canvas, float f10, float f11, a0 a0Var) {
        List<m> c10 = a0Var.c(this.E);
        float f12 = 0.0f;
        for (m mVar : c10) {
            if (!mVar.d() && f12 < mVar.b(this.K)) {
                f12 = mVar.b(this.K);
            }
        }
        float width = f10 + ((canvas.getWidth() - f12) / 2);
        for (m mVar2 : c10) {
            float textSize = f11 - (this.K.getTextSize() * 1.25f);
            float c11 = mVar2.c() + width;
            if (mVar2.d()) {
                canvas.drawText(mVar2.a(), c11, textSize, this.P);
                canvas.drawText(mVar2.a(), c11, textSize, this.O);
            } else {
                canvas.drawText(mVar2.a(), c11, f11, this.L);
                canvas.drawText(mVar2.a(), c11, f11, this.K);
            }
            if (!(mVar2.e() == 0.0f)) {
                if (mVar2.f()) {
                    if (mVar2.d()) {
                        canvas.drawText(mVar2.a(), c11, textSize, this.R);
                        canvas.drawText(mVar2.a(), c11, textSize, this.Q);
                    } else {
                        canvas.drawText(mVar2.a(), c11, f11, this.N);
                        canvas.drawText(mVar2.a(), c11, f11, this.M);
                    }
                } else if (mVar2.d()) {
                    canvas.drawBitmap(l(canvas.getHeight(), mVar2.a(), textSize, this.R, mVar2.e()), c11 - this.R.getStrokeWidth(), 0.0f, (Paint) null);
                    canvas.drawBitmap(l(canvas.getHeight(), mVar2.a(), textSize, this.Q, mVar2.e()), c11, 0.0f, (Paint) null);
                } else {
                    canvas.drawBitmap(l(canvas.getHeight(), mVar2.a(), f11, this.N, mVar2.e()), c11 - this.N.getStrokeWidth(), 0.0f, (Paint) null);
                    canvas.drawBitmap(l(canvas.getHeight(), mVar2.a(), f11, this.M, mVar2.e()), c11, 0.0f, (Paint) null);
                }
            }
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i10;
        super.onDraw(canvas);
        if (getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        float f10 = this.D + 10.0f;
        Canvas canvas2 = this.V;
        Bitmap bufferBitmap = getBufferBitmap();
        this.U = bufferBitmap;
        canvas2.setBitmap(bufferBitmap);
        Canvas canvas3 = this.V;
        a0 a0Var = this.F;
        if (a0Var != null) {
            o(canvas3, 0.0f, m(0) + f10, a0Var);
        }
        a0 a0Var2 = this.G;
        if (a0Var2 != null) {
            o(canvas3, 0.0f, m(1) + f10, a0Var2);
        }
        a0 a0Var3 = this.H;
        if (a0Var3 != null) {
            o(canvas3, 0.0f, m(2) + f10, a0Var3);
        }
        a0 a0Var4 = this.I;
        if (a0Var4 != null) {
            o(canvas3, 0.0f, f10 + m(3), a0Var4);
        }
        if (canvas != null) {
            Bitmap bitmap = this.U;
            p.e(bitmap);
            Rect rect = this.W;
            if (rect == null) {
                p.v("srcRect");
                rect = null;
            }
            RectF rectF = this.f26356a0;
            if (rectF == null) {
                p.v("dstRect");
                rectF = null;
            }
            canvas.drawBitmap(bitmap, rect, rectF, (Paint) null);
        }
        float f11 = this.D;
        if (f11 >= 0.0f && (i10 = this.E - this.J) >= 0) {
            float f12 = f11 - (i10 / 10.0f);
            this.D = f12;
            if (f12 <= 0.0f) {
                this.D = 0.0f;
            }
        }
        this.J = this.E;
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        h();
    }

    public final void p(v vVar, String str) {
        g9.a.g("setKaraokeModel()");
        w();
        this.f26357w = vVar;
        this.f26359y = str;
        n();
        this.f26360z.set(false);
        r();
    }

    public final void q(v vVar, String str, int i10, int i11) {
        p.h(vVar, "karaokeModel");
        p.h(str, "songUrl");
        setSpeedLevel(i10);
        setPitchLevel(i11);
        p(vVar, str);
    }

    public final void r() {
        g9.a.g("start()");
        if (this.f26360z.compareAndSet(false, true)) {
            n();
            MediaPlayer mediaPlayer = this.f26358x;
            if (mediaPlayer != null) {
                mediaPlayer.setDataSource(getContext(), Uri.parse(this.f26359y));
            }
            MediaPlayer mediaPlayer2 = this.f26358x;
            if (mediaPlayer2 != null) {
                mediaPlayer2.prepareAsync();
            }
            MediaPlayer mediaPlayer3 = this.f26358x;
            if (mediaPlayer3 != null) {
                mediaPlayer3.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: sf.d
                    @Override // android.media.MediaPlayer.OnPreparedListener
                    public final void onPrepared(MediaPlayer mediaPlayer4) {
                        KaraokeView.s(KaraokeView.this, mediaPlayer4);
                    }
                });
            }
        }
    }

    public final void setOnKaraokeListener(b bVar) {
        p.h(bVar, "listener");
        g9.a.g("setOnKaraokeListener()");
        this.B = bVar;
    }

    public final void setPitchLevel(int i10) {
        double pow;
        if (-11 >= i10) {
            pow = Math.pow(2.0d, -0.9166666666666666d);
        } else if (11 <= i10) {
            pow = Math.pow(2.0d, 0.9166666666666666d);
        } else {
            pow = Math.pow(2.0d, i10 / 12.0d);
        }
        setPitch((float) pow);
    }

    public final void setSpeedLevel(int i10) {
        float f10;
        float f11;
        if (-8 >= i10) {
            i10 = -8;
        } else if (8 <= i10) {
            i10 = 8;
        }
        if (i10 > 0) {
            f10 = i10;
            f11 = 0.1f;
        } else {
            f10 = i10;
            f11 = 0.03f;
        }
        setSpeed((f10 * f11) + 1.0f);
    }

    public final void u() {
        c cVar = this.A;
        if (cVar != null) {
            cVar.interrupt();
        }
        c cVar2 = new c();
        cVar2.start();
        this.A = cVar2;
    }

    public final void v() {
        g9.a.g("stop()");
        if (this.f26360z.compareAndSet(true, false)) {
            MediaPlayer mediaPlayer = this.f26358x;
            if (mediaPlayer != null) {
                mediaPlayer.release();
            }
            this.f26358x = null;
            w();
        }
    }

    public final void w() {
        c cVar = this.A;
        if (cVar != null) {
            cVar.interrupt();
        }
        this.A = null;
    }
}
