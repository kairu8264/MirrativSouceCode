package qf;

import ae.qh;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.dena.mirrorman.net.glide.GlideApp;
import com.dena.mirrorman.net.glide.GlideRequest;
import oq.a;
import ud.r4;

/* loaded from: classes3.dex */
public final class o extends RecyclerView.e0 implements oq.a {

    /* renamed from: x  reason: collision with root package name */
    public static final a f49310x = new a(null);

    /* renamed from: y  reason: collision with root package name */
    public static final int f49311y = 8;

    /* renamed from: w  reason: collision with root package name */
    public final qh f49312w;

    /* loaded from: classes3.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final o a(ViewGroup viewGroup) {
            jo.p.h(viewGroup, "parent");
            ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(viewGroup.getContext()), nd.b1.view_holder_player_comment_prize, viewGroup, false);
            jo.p.g(e10, "inflate(\n               …      false\n            )");
            return new o((qh) e10, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends f8.c<Bitmap> {
        public final /* synthetic */ SpannableStringBuilder A;

        public b(SpannableStringBuilder spannableStringBuilder) {
            this.A = spannableStringBuilder;
        }

        @Override // f8.j
        /* renamed from: a */
        public void e(Bitmap bitmap, g8.b<? super Bitmap> bVar) {
            jo.p.h(bitmap, "resource");
            o.this.f(this.A, bitmap);
        }

        @Override // f8.j
        public void g(Drawable drawable) {
        }
    }

    public o(qh qhVar) {
        super(qhVar.u());
        this.f49312w = qhVar;
    }

    public /* synthetic */ o(qh qhVar, jo.h hVar) {
        this(qhVar);
    }

    public final void b(String str, String str2, String str3, String str4, io.l<? super String, wn.v> lVar) {
        AppCompatImageView appCompatImageView = this.f49312w.E;
        jo.p.g(appCompatImageView, "binding.rewardImageView");
        td.a.f(appCompatImageView, str3);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("  " + str);
        int U = so.o.U(spannableStringBuilder, str2, 0, false, 6, null);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(c3.a.d(this.f49312w.u().getContext(), nd.w0.f42237m)), U, str2.length() + U, 33);
        this.f49312w.C.setText(spannableStringBuilder);
        if (str4 == null || str4.length() == 0) {
            Bitmap decodeResource = BitmapFactory.decodeResource(this.f49312w.u().getContext().getResources(), nd.y0.X1);
            jo.p.g(decodeResource, "defaultIcon");
            f(spannableStringBuilder, decodeResource);
            return;
        }
        GlideApp.with(this.f49312w.u()).asBitmap().load(str4).apply((e8.a<?>) e8.h.circleCropTransform()).into((GlideRequest<Bitmap>) new b(spannableStringBuilder));
    }

    public final void c(ud.b3 b3Var, io.l<? super String, wn.v> lVar) {
        jo.p.h(b3Var, "bindModel");
        b(b3Var.a(), b3Var.h(), b3Var.g(), b3Var.f(), lVar);
    }

    public final void d(r4 r4Var, io.l<? super String, wn.v> lVar) {
        jo.p.h(r4Var, "bindModel");
        b(r4Var.a(), r4Var.j(), r4Var.i(), r4Var.f(), lVar);
    }

    public final void f(SpannableStringBuilder spannableStringBuilder, Bitmap bitmap) {
        AppCompatTextView appCompatTextView = this.f49312w.C;
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, de.m.a(this, 16), de.m.a(this, 16), true);
        float a10 = de.m.a(this, 16);
        float a11 = de.m.a(this, 16);
        Bitmap createBitmap = Bitmap.createBitmap((int) a10, (int) a11, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f10 = a10 / 2.0f;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(-1);
        float f11 = 2;
        float f12 = a10 / f11;
        float f13 = a11 / f11;
        canvas.drawCircle(f12, f13, f10, paint);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new BitmapShader(createScaledBitmap, tileMode, tileMode));
        canvas.drawCircle(f12, f13, f10 - 1, paint);
        spannableStringBuilder.setSpan(new ImageSpan(this.f49312w.u().getContext(), createBitmap, 0), 0, 1, 33);
        appCompatTextView.setText(spannableStringBuilder);
    }

    @Override // oq.a
    public nq.a getKoin() {
        return a.C0688a.a(this);
    }
}
