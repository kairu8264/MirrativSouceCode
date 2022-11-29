package com.dena.mirrorman.feature.comment;

import ae.ia;
import android.animation.Animator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ao.d;
import co.f;
import com.airbnb.lottie.LottieAnimationView;
import com.dena.mirrorman.customview.GiftPointView;
import com.dena.mirrorman.net.bcsvr.response.GiftItem;
import io.l;
import io.p;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import jo.e0;
import jo.h;
import jo.q;
import kotlin.NoWhenBranchMatchedException;
import s6.g;
import sf.i;
import uo.b1;
import uo.g1;
import uo.q0;
import uo.v1;
import wn.l;
import wn.m;
import wn.v;
import yd.y;
import yd.z;

/* loaded from: classes2.dex */
public final class GiftEffectView extends ConstraintLayout {
    public static final a W = new a(null);

    /* renamed from: a0  reason: collision with root package name */
    public static final int f25699a0 = 8;
    public final ia U;
    public final ConcurrentHashMap<Integer, Rect> V;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q implements l<Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public static final b f25700w = new b();

        public b() {
            super(1);
        }

        public final void a(int i10) {
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(Integer num) {
            a(num.intValue());
            return v.f59242a;
        }
    }

    @f(c = "com.dena.mirrorman.feature.comment.GiftEffectView$startGiftEffect$3$1", f = "GiftEffectView.kt", l = {196, 225}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends co.l implements p<q0, d<? super v>, Object> {
        public int A;
        public int B;
        public int C;
        public /* synthetic */ Object D;
        public final /* synthetic */ GiftItem E;
        public final /* synthetic */ GiftEffectView F;
        public final /* synthetic */ he.a G;
        public final /* synthetic */ Bitmap H;
        public final /* synthetic */ String I;
        public final /* synthetic */ e0<Bitmap> J;
        public final /* synthetic */ d<v> K;

        /* renamed from: w  reason: collision with root package name */
        public Object f25701w;

        /* renamed from: x  reason: collision with root package name */
        public Object f25702x;

        /* renamed from: y  reason: collision with root package name */
        public Object f25703y;

        /* renamed from: z  reason: collision with root package name */
        public int f25704z;

        /* loaded from: classes2.dex */
        public static final class a implements s6.b {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ he.a f25705a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ Bitmap f25706b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ e0<Bitmap> f25707c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ Bitmap f25708d;

            /* renamed from: com.dena.mirrorman.feature.comment.GiftEffectView$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public /* synthetic */ class C0227a {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f25709a;

                static {
                    int[] iArr = new int[he.a.values().length];
                    iArr[he.a.GRADE_1.ordinal()] = 1;
                    iArr[he.a.GRADE_2.ordinal()] = 2;
                    iArr[he.a.GRADE_3.ordinal()] = 3;
                    iArr[he.a.GRADE_4.ordinal()] = 4;
                    iArr[he.a.GRADE_5.ordinal()] = 5;
                    iArr[he.a.GRADE_6.ordinal()] = 6;
                    iArr[he.a.GRADE_7.ordinal()] = 7;
                    f25709a = iArr;
                }
            }

            public a(he.a aVar, Bitmap bitmap, e0<Bitmap> e0Var, Bitmap bitmap2) {
                this.f25705a = aVar;
                this.f25706b = bitmap;
                this.f25707c = e0Var;
                this.f25708d = bitmap2;
            }

            @Override // s6.b
            public final Bitmap a(g gVar) {
                switch (C0227a.f25709a[this.f25705a.ordinal()]) {
                    case 1:
                    case 2:
                        String e10 = gVar.e();
                        if (jo.p.c(e10, "image_0")) {
                            return this.f25706b;
                        }
                        if (jo.p.c(e10, "image_1")) {
                            return this.f25707c.f38136w;
                        }
                        return null;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                        String e11 = gVar.e();
                        if (e11 != null) {
                            switch (e11.hashCode()) {
                                case 1911933516:
                                    if (e11.equals("image_0")) {
                                        return this.f25706b;
                                    }
                                    return null;
                                case 1911933517:
                                    if (e11.equals("image_1")) {
                                        return this.f25708d;
                                    }
                                    return null;
                                case 1911933518:
                                    if (e11.equals("image_2")) {
                                        return this.f25707c.f38136w;
                                    }
                                    return null;
                                default:
                                    return null;
                            }
                        }
                        return null;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* loaded from: classes2.dex */
        public static final class b implements i {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ GiftEffectView f25710a;

            /* renamed from: b  reason: collision with root package name */
            public final /* synthetic */ int f25711b;

            /* renamed from: c  reason: collision with root package name */
            public final /* synthetic */ ConstraintLayout f25712c;

            /* renamed from: d  reason: collision with root package name */
            public final /* synthetic */ int f25713d;

            /* renamed from: e  reason: collision with root package name */
            public final /* synthetic */ GiftItem f25714e;

            /* renamed from: f  reason: collision with root package name */
            public final /* synthetic */ d<v> f25715f;

            /* JADX WARN: Multi-variable type inference failed */
            public b(GiftEffectView giftEffectView, int i10, ConstraintLayout constraintLayout, int i11, GiftItem giftItem, d<? super v> dVar) {
                this.f25710a = giftEffectView;
                this.f25711b = i10;
                this.f25712c = constraintLayout;
                this.f25713d = i11;
                this.f25714e = giftItem;
                this.f25715f = dVar;
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                i.a.a(this, animator);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                this.f25710a.V.remove(Integer.valueOf(this.f25711b));
                this.f25710a.U.G.removeView(this.f25712c);
                if (this.f25713d == this.f25714e.getCount()) {
                    d<v> dVar = this.f25715f;
                    l.a aVar = wn.l.f59224w;
                    dVar.resumeWith(wn.l.a(v.f59242a));
                }
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
                i.a.c(this, animator);
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                i.a.d(this, animator);
            }
        }

        @f(c = "com.dena.mirrorman.feature.comment.GiftEffectView$startGiftEffect$3$1$3", f = "GiftEffectView.kt", l = {213, 215}, m = "invokeSuspend")
        /* renamed from: com.dena.mirrorman.feature.comment.GiftEffectView$c$c  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C0228c extends co.l implements p<q0, d<? super v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f25716w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ he.a f25717x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ LottieAnimationView f25718y;

            /* renamed from: z  reason: collision with root package name */
            public final /* synthetic */ GiftItem f25719z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0228c(he.a aVar, LottieAnimationView lottieAnimationView, GiftItem giftItem, d<? super C0228c> dVar) {
                super(2, dVar);
                this.f25717x = aVar;
                this.f25718y = lottieAnimationView;
                this.f25719z = giftItem;
            }

            @Override // co.a
            public final d<v> create(Object obj, d<?> dVar) {
                return new C0228c(this.f25717x, this.f25718y, this.f25719z, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, d<? super v> dVar) {
                return ((C0228c) create(q0Var, dVar)).invokeSuspend(v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f25716w;
                if (i10 == 0) {
                    m.b(obj);
                    long r10 = this.f25717x.r();
                    this.f25716w = 1;
                    if (b1.a(r10, this) == c10) {
                        return c10;
                    }
                } else if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    m.b(obj);
                    this.f25718y.z(((float) this.f25717x.r()) / ((float) this.f25718y.getDuration()), 1.0f);
                    this.f25718y.r();
                    return v.f59242a;
                } else {
                    m.b(obj);
                }
                this.f25718y.q();
                this.f25716w = 2;
                if (b1.a(this.f25719z.getPauseDuration() * 1000, this) == c10) {
                    return c10;
                }
                this.f25718y.z(((float) this.f25717x.r()) / ((float) this.f25718y.getDuration()), 1.0f);
                this.f25718y.r();
                return v.f59242a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(GiftItem giftItem, GiftEffectView giftEffectView, he.a aVar, Bitmap bitmap, String str, e0<Bitmap> e0Var, d<? super v> dVar, d<? super c> dVar2) {
            super(2, dVar2);
            this.E = giftItem;
            this.F = giftEffectView;
            this.G = aVar;
            this.H = bitmap;
            this.I = str;
            this.J = e0Var;
            this.K = dVar;
        }

        @Override // co.a
        public final d<v> create(Object obj, d<?> dVar) {
            c cVar = new c(this.E, this.F, this.G, this.H, this.I, this.J, this.K, dVar);
            cVar.D = obj;
            return cVar;
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, d<? super v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:15:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00e4  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x011a  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0141  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x01e2  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0242  */
        /* JADX WARN: Removed duplicated region for block: B:52:0x0280 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0281  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x0285  */
        /* JADX WARN: Type inference failed for: r3v14, types: [T, android.graphics.Bitmap] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0281 -> B:54:0x0283). Please submit an issue!!! */
        @Override // co.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r26) {
            /*
                Method dump skipped, instructions count: 657
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrorman.feature.comment.GiftEffectView.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GiftEffectView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        jo.p.h(context, "context");
    }

    public /* synthetic */ GiftEffectView(Context context, AttributeSet attributeSet, int i10, int i11, h hVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    public static /* synthetic */ Bitmap K(GiftEffectView giftEffectView, Bitmap bitmap, Rect rect, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            rect = null;
        }
        return giftEffectView.J(bitmap, rect);
    }

    public final void D(Rect rect, ConstraintLayout constraintLayout, View view, LottieAnimationView lottieAnimationView) {
        this.U.G.addView(constraintLayout);
        androidx.constraintlayout.widget.c cVar = new androidx.constraintlayout.widget.c();
        cVar.g(this.U.G);
        int i10 = rect.left - ((lottieAnimationView.getLayoutParams().width - view.getLayoutParams().width) / 2);
        cVar.i(constraintLayout.getId(), 6, 0, 6);
        cVar.B(constraintLayout.getId(), i10);
        cVar.i(constraintLayout.getId(), 3, 0, 3);
        cVar.C(constraintLayout.getId(), rect.top - ((lottieAnimationView.getLayoutParams().height - view.getLayoutParams().height) / 2));
        cVar.c(this.U.G);
    }

    public final boolean E(Rect rect, Rect rect2) {
        return ((float) Math.abs(rect2.centerX() - rect.centerX())) < (((float) rect2.width()) / 4.0f) + (((float) rect.width()) / 4.0f) && ((float) Math.abs(rect2.centerY() - rect.centerY())) < (((float) rect2.height()) / 4.0f) + (((float) rect.height()) / 4.0f);
    }

    public final void F() {
        this.V.clear();
    }

    public final Bitmap G(int i10, int i11, GiftItem giftItem) {
        Context context = getContext();
        jo.p.g(context, "context");
        GiftPointView giftPointView = new GiftPointView(context);
        giftPointView.setGiftItem(giftItem);
        giftPointView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        giftPointView.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
        giftPointView.layout(0, 0, giftPointView.getMeasuredWidth(), giftPointView.getMeasuredHeight());
        Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        giftPointView.draw(new Canvas(createBitmap));
        jo.p.g(createBitmap, "giftPointViewBitmap");
        return createBitmap;
    }

    public final Bitmap H(int i10, int i11, String str, int i12, Bitmap bitmap) {
        Context context = getContext();
        jo.p.g(context, "context");
        z zVar = new z(context, null, 0, 6, null);
        zVar.setBackground(i12);
        zVar.setUserName(str);
        zVar.setProfileImage(bitmap);
        zVar.setLayoutParams(new ConstraintLayout.b(-2, -2));
        zVar.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
        zVar.layout(0, 0, zVar.getMeasuredWidth(), zVar.getMeasuredHeight());
        Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        zVar.draw(new Canvas(createBitmap));
        jo.p.g(createBitmap, "nameplateViewBitmap");
        return createBitmap;
    }

    public final Bitmap I(int i10, int i11, String str, Bitmap bitmap) {
        Context context = getContext();
        jo.p.g(context, "context");
        y yVar = new y(context, null, 0, 6, null);
        yVar.setMessage(str);
        yVar.setGiftImage(bitmap);
        yVar.setLayoutParams(new ConstraintLayout.b(-2, -2));
        yVar.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
        yVar.layout(0, 0, yVar.getMeasuredWidth(), yVar.getMeasuredHeight());
        Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        yVar.draw(new Canvas(createBitmap));
        jo.p.g(createBitmap, "giftImageViewBitmap");
        return createBitmap;
    }

    public final Bitmap J(Bitmap bitmap, Rect rect) {
        if (bitmap == null) {
            return null;
        }
        Rect rect2 = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
        if (rect == null) {
            rect = rect2;
        }
        Bitmap createBitmap = Bitmap.createBitmap(rect.width(), rect.height(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-12434878);
        canvas.drawCircle(rect.width() / 2, rect.height() / 2, rect.width() / 2, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(bitmap, rect2, rect, paint);
        return createBitmap;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [T, android.graphics.Bitmap] */
    public final Object L(GiftItem giftItem, Bitmap bitmap, Bitmap bitmap2, String str, boolean z10, io.l<? super Integer, v> lVar, d<? super v> dVar) {
        ao.i iVar = new ao.i(bo.b.b(dVar));
        if (z10) {
            this.V.put(co.b.d(this.U.B.getId()), new Rect(this.U.B.getLeft(), this.U.B.getTop(), this.U.B.getLeft() + this.U.B.getWidth(), this.U.B.getLeft() + this.U.B.getHeight()));
        } else {
            this.V.remove(co.b.d(this.U.B.getId()));
        }
        he.a[] values = he.a.values();
        int length = values.length - 1;
        if (length >= 0) {
            while (true) {
                int i10 = length - 1;
                he.a aVar = values[length];
                if (!(giftItem.getUnitPoint() >= aVar.s())) {
                    if (i10 < 0) {
                        break;
                    }
                    length = i10;
                } else {
                    e0 e0Var = new e0();
                    e0Var.f38136w = Bitmap.createScaledBitmap(bitmap, aVar.n().width(), aVar.n().height(), true);
                    uo.l.d(v1.f56093w, g1.c(), null, new c(giftItem, this, aVar, (aVar == he.a.GRADE_1 || aVar == he.a.GRADE_2 || aVar == he.a.GRADE_3) ? null : K(this, bitmap2, null, 2, null), str, e0Var, iVar, null), 2, null);
                    Object a10 = iVar.a();
                    if (a10 == bo.c.c()) {
                        co.h.c(dVar);
                    }
                    return a10 == bo.c.c() ? a10 : v.f59242a;
                }
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftEffectView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        jo.p.h(context, "context");
        this.U = (ia) androidx.databinding.f.e(LayoutInflater.from(context), nd.b1.view_gift_effect, this, true);
        this.V = new ConcurrentHashMap<>();
    }
}
