package td;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.ImageView;
import com.dena.mirrorman.net.glide.GlideApp;
import com.dena.mirrorman.net.glide.GlideRequest;
import com.dena.mirrorman.net.glide.GlideRequests;
import de.n;
import e8.h;
import io.l;
import java.util.ArrayList;
import jo.p;
import jo.q;
import l7.k;
import m7.f;
import nd.d1;
import nd.w0;
import nd.y0;
import sn.c;
import so.o;
import v7.i;
import v7.y;
import wn.v;
import xd.d;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f53592a = new a();

    /* renamed from: td.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C0832a extends q implements l<Uri, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ImageView f53593w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ int f53594x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ Drawable f53595y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0832a(ImageView imageView, int i10, Drawable drawable) {
            super(1);
            this.f53593w = imageView;
            this.f53594x = i10;
            this.f53595y = drawable;
        }

        public final void a(Uri uri) {
            GlideRequest<Drawable> load;
            GlideRequests with = GlideApp.with(this.f53593w);
            Drawable drawable = this.f53595y;
            if (uri == null) {
                load = with.load(drawable);
            } else {
                load = with.load(uri);
            }
            load.apply((e8.a<?>) h.bitmapTransform(new f(new i(), new sn.c(this.f53594x, 0, c.b.TOP_LEFT), new sn.c(this.f53594x, 0, c.b.TOP_RIGHT)))).into(this.f53593w);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(Uri uri) {
            a(uri);
            return v.f59242a;
        }
    }

    public static final void A(ImageView imageView, Bitmap bitmap) {
        p.h(imageView, "imageView");
        if (bitmap == null) {
            return;
        }
        imageView.setImageBitmap(bitmap);
    }

    public static final void B(ImageView imageView, String str) {
        p.h(imageView, "imageView");
        GlideApp.with(imageView).load(str).apply((e8.a<?>) h.bitmapTransform(new f(new i(), new y(n.b(imageView, 20))))).into(imageView);
    }

    public static final void C(ImageView imageView, Bitmap bitmap) {
        p.h(imageView, "imageView");
        GlideApp.with(imageView).load(bitmap).apply((e8.a<?>) new h().circleCrop()).into(imageView);
    }

    public static final void D(ImageView imageView, String str) {
        p.h(imageView, "imageView");
        GlideApp.with(imageView).load(str).apply((e8.a<?>) new h().circleCrop()).into(imageView);
    }

    public static final void E(ImageView imageView, Integer num) {
        p.h(imageView, "imageView");
        if (num != null) {
            num.intValue();
            imageView.setImageResource(num.intValue());
        }
    }

    public static final void F(ImageView imageView, Integer num) {
        p.h(imageView, "imageView");
        if (num != null) {
            num.intValue();
            imageView.setImageResource(num.intValue());
        }
    }

    public static final void G(ImageView imageView, String str, Drawable drawable, Boolean bool) {
        p.h(imageView, "imageView");
        de.f.c(imageView, str, bool != null ? bool.booleanValue() : false, new C0832a(imageView, n.b(imageView, 12), drawable));
    }

    public static /* synthetic */ void H(ImageView imageView, String str, Drawable drawable, Boolean bool, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            bool = Boolean.FALSE;
        }
        G(imageView, str, drawable, bool);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Integer] */
    public static final void a(ImageView imageView, String str) {
        p.h(imageView, "imageView");
        GlideRequests with = GlideApp.with(imageView);
        if (str == 0 || str.length() == 0) {
            str = Integer.valueOf(y0.U1);
        }
        with.load(str).apply(h.bitmapTransform(new xd.a(n.b(imageView, 1), c3.a.d(imageView.getContext(), w0.U0)))).into(imageView);
    }

    public static final void b(ImageView imageView, String str) {
        GlideRequest<Drawable> load;
        p.h(imageView, "imageView");
        GlideRequests with = GlideApp.with(imageView);
        if (TextUtils.isEmpty(str)) {
            load = with.load(Integer.valueOf(d1.img_cap_64_default));
        } else {
            load = with.load(str);
        }
        load.apply((e8.a<?>) h.bitmapTransform(new f(new i(), new d(n.b(imageView, 8), n.b(imageView, 1), c3.a.d(imageView.getContext(), w0.U0))))).into(imageView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Integer] */
    public static final void c(ImageView imageView, String str) {
        p.h(imageView, "imageView");
        GlideRequests with = GlideApp.with(imageView);
        if (str == 0 || str.length() == 0) {
            str = Integer.valueOf(y0.V1);
        }
        with.load(str).apply(h.bitmapTransform(new xd.a(n.b(imageView, 2), c3.a.d(imageView.getContext(), w0.U0)))).into(imageView);
    }

    public static final void d(ImageView imageView, String str) {
        p.h(imageView, "imageView");
        GlideApp.with(imageView).load(str).apply((e8.a<?>) h.bitmapTransform(new d(n.b(imageView, 6), n.b(imageView, 1), c3.a.d(imageView.getContext(), w0.U0)))).into(imageView);
    }

    public static final void e(ImageView imageView, String str) {
        p.h(imageView, "imageView");
        GlideApp.with(imageView).load(str).apply((e8.a<?>) new h().centerCrop()).into(imageView);
    }

    public static final void f(ImageView imageView, String str) {
        p.h(imageView, "imageView");
        GlideApp.with(imageView).load(str).into(imageView);
    }

    public static final void g(ImageView imageView, String str) {
        p.h(imageView, "imageView");
        int b10 = n.b(imageView, 12);
        GlideApp.with(imageView).load(str).placeholder(d1.f41956s).apply((e8.a<?>) h.bitmapTransform(new f(new i(), new sn.c(b10, 0, c.b.TOP_LEFT), new sn.c(b10, 0, c.b.BOTTOM_LEFT)))).into(imageView);
    }

    public static final void h(ImageView imageView, String str) {
        p.h(imageView, "imageView");
        GlideApp.with(imageView).load(str).placeholder(d1.f41956s).apply((e8.a<?>) h.bitmapTransform(new f(new i(), new y(n.b(imageView, 4))))).into(imageView).a();
    }

    public static final void i(ImageView imageView, String str) {
        p.h(imageView, "imageView");
        GlideApp.with(imageView).load(str).placeholder(y0.Y1).apply((e8.a<?>) new h().circleCrop()).into(imageView).a();
    }

    public static final void j(ImageView imageView, String str, int i10) {
        p.h(imageView, "imageView");
        GlideApp.with(imageView).load(str).placeholder(i10).apply((e8.a<?>) h.bitmapTransform(new f(new i(), new y(n.b(imageView, 12))))).into(imageView);
    }

    public static /* synthetic */ void k(ImageView imageView, String str, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = d1.f41952g;
        }
        j(imageView, str, i10);
    }

    public static final void l(ImageView imageView, String str) {
        p.h(imageView, "imageView");
        GlideApp.with(imageView).load(str).placeholder(d1.f41952g).apply((e8.a<?>) h.bitmapTransform(new f(new i(), new y(n.b(imageView, 18))))).into(imageView);
    }

    public static final void m(ImageView imageView, String str) {
        p.h(imageView, "imageView");
        GlideApp.with(imageView).load(str).apply((e8.a<?>) h.bitmapTransform(new f(new i(), new y(n.b(imageView, 4))))).into(imageView);
    }

    public static final void n(ImageView imageView, String str, int i10) {
        p.h(imageView, "imageView");
        GlideApp.with(imageView).load(str).placeholder(i10).apply((e8.a<?>) h.bitmapTransform(new f(new i(), new y(n.b(imageView, 6))))).into(imageView);
    }

    public static /* synthetic */ void o(ImageView imageView, String str, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = d1.f41952g;
        }
        n(imageView, str, i10);
    }

    public static final void p(ImageView imageView, String str) {
        p.h(imageView, "imageView");
        GlideApp.with(imageView).load(str).apply((e8.a<?>) h.bitmapTransform(new f(new i(), new y(n.b(imageView, 6))))).into(imageView);
    }

    public static final void q(ImageView imageView, String str, int i10) {
        p.h(imageView, "imageView");
        GlideApp.with(imageView).load(str).placeholder(i10).apply((e8.a<?>) h.bitmapTransform(new f(new i(), new y(n.b(imageView, 8))))).into(imageView);
    }

    public static final void r(ImageView imageView, String str, Integer num, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5) {
        p.h(imageView, "imageView");
        int b10 = n.b(imageView, num != null ? num.intValue() : 0);
        ArrayList arrayList = new ArrayList();
        if (!p.c(bool, Boolean.FALSE)) {
            arrayList.add(new i());
        }
        Boolean bool6 = Boolean.TRUE;
        if (p.c(bool2, bool6)) {
            arrayList.add(new sn.c(b10, 0, c.b.TOP_LEFT));
        }
        if (p.c(bool3, bool6)) {
            arrayList.add(new sn.c(b10, 0, c.b.BOTTOM_LEFT));
        }
        if (p.c(bool4, bool6)) {
            arrayList.add(new sn.c(b10, 0, c.b.TOP_RIGHT));
        }
        if (p.c(bool5, bool6)) {
            arrayList.add(new sn.c(b10, 0, c.b.BOTTOM_RIGHT));
        }
        GlideApp.with(imageView).load(str).apply((e8.a<?>) h.bitmapTransform(new f(arrayList))).into(imageView);
    }

    public static final void t(ImageView imageView, String str, Integer num, Integer num2, Integer num3) {
        p.h(imageView, "imageView");
        GlideRequest<Drawable> load = GlideApp.with(imageView).load(str);
        m7.l[] lVarArr = new m7.l[2];
        lVarArr[0] = new i();
        lVarArr[1] = new d(n.b(imageView, num != null ? num.intValue() : 0), n.b(imageView, num2 != null ? num2.intValue() : 0), c3.a.d(imageView.getContext(), num3 != null ? num3.intValue() : 17170445));
        load.apply((e8.a<?>) h.bitmapTransform(new f(lVarArr))).into(imageView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Integer] */
    public static final void u(ImageView imageView, String str) {
        p.h(imageView, "imageView");
        GlideRequests with = GlideApp.with(imageView);
        if (str == 0 || str.length() == 0) {
            str = Integer.valueOf(y0.V1);
        }
        with.load(str).apply(h.bitmapTransform(new xd.a(n.b(imageView, 2), c3.a.d(imageView.getContext(), w0.f42242u0)))).into(imageView);
    }

    public static final void v(ImageView imageView, String str) {
        p.h(imageView, "imageView");
        boolean z10 = true;
        if (str == null || !o.H(str, ".webp", false, 2, null)) {
            z10 = false;
        }
        if (z10) {
            GlideApp.with(imageView).load(str).optionalTransform(k.class, (m7.l) new l7.n(new v7.q())).into(imageView);
        } else {
            GlideApp.with(imageView).load(str).apply((e8.a<?>) new h().fitCenter()).into(imageView);
        }
    }

    public static final void w(ImageView imageView, String str, Integer num) {
        p.h(imageView, "imageView");
        if (str != null && o.H(str, ".webp", false, 2, null)) {
            GlideRequest<Drawable> load = GlideApp.with(imageView).load(str);
            m7.l[] lVarArr = new m7.l[2];
            lVarArr[0] = new v7.q();
            lVarArr[1] = new y(n.b(imageView, num != null ? num.intValue() : 0));
            load.optionalTransform(k.class, (m7.l) new l7.n(new f(lVarArr))).into(imageView);
            return;
        }
        GlideRequest<Drawable> load2 = GlideApp.with(imageView).load(str);
        m7.l[] lVarArr2 = new m7.l[2];
        lVarArr2[0] = new v7.q();
        lVarArr2[1] = new y(n.b(imageView, num != null ? num.intValue() : 0));
        load2.apply((e8.a<?>) h.bitmapTransform(new f(lVarArr2))).into(imageView);
    }

    public static final void x(ImageView imageView, Integer num) {
        p.h(imageView, "imageView");
        GlideApp.with(imageView).load(num).optionalTransform(k.class, (m7.l) new l7.n(new v7.q())).into(imageView);
    }

    public static final void y(ImageView imageView, Bitmap bitmap) {
        p.h(imageView, "imageView");
        if (bitmap == null) {
            return;
        }
        GlideApp.with(imageView).load(bitmap).dontAnimate().apply((e8.a<?>) h.bitmapTransform(new xd.a(n.b(imageView, 2), c3.a.d(imageView.getContext(), w0.U0)))).into(imageView);
    }

    public static final void z(ImageView imageView, Integer num) {
        p.h(imageView, "imageView");
        if (num != null) {
            num.intValue();
            Drawable background = imageView.getBackground();
            GradientDrawable gradientDrawable = background instanceof GradientDrawable ? (GradientDrawable) background : null;
            if (gradientDrawable != null) {
                gradientDrawable.setColor(num.intValue());
            }
        }
    }
}
