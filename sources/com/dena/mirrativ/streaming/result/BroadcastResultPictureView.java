package com.dena.mirrativ.streaming.result;

import ac.l4;
import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import ao.g;
import co.l;
import com.airbnb.lottie.LottieAnimationView;
import com.dena.mirrorman.net.api.response.BroadcastResult;
import com.dena.mirrorman.net.api.response.BroadcastResultEventType;
import com.dena.mirrorman.net.glide.GlideApp;
import io.p;
import java.util.Arrays;
import jo.h;
import jo.i0;
import so.o;
import uo.b0;
import uo.b1;
import uo.g1;
import uo.i2;
import uo.q0;
import wn.m;
import wn.v;
import xb.n;
import xb.r;

/* loaded from: classes2.dex */
public final class BroadcastResultPictureView extends FrameLayout implements q0 {

    /* renamed from: y  reason: collision with root package name */
    public static final a f24063y = new a(null);

    /* renamed from: z  reason: collision with root package name */
    public static final int f24064z = 8;

    /* renamed from: w  reason: collision with root package name */
    public final b0 f24065w;

    /* renamed from: x  reason: collision with root package name */
    public final l4 f24066x;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f24067a;

        static {
            int[] iArr = new int[BroadcastResultEventType.values().length];
            iArr[BroadcastResultEventType.NONE.ordinal()] = 1;
            iArr[BroadcastResultEventType.DEBUT.ordinal()] = 2;
            iArr[BroadcastResultEventType.MAINICHI.ordinal()] = 3;
            iArr[BroadcastResultEventType.MEI_MAINICHI.ordinal()] = 4;
            iArr[BroadcastResultEventType.CHO_MAINICHI.ordinal()] = 5;
            iArr[BroadcastResultEventType.KIWAMI_MAINICHI.ordinal()] = 6;
            iArr[BroadcastResultEventType.DENDO_MAINICHI.ordinal()] = 7;
            f24067a = iArr;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.result.BroadcastResultPictureView$bind$1", f = "BroadcastResultPictureView.kt", l = {101}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends l implements p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f24068w;

        public c(ao.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new c(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f24068w;
            if (i10 == 0) {
                m.b(obj);
                this.f24068w = 1;
                if (b1.a(6000L, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                m.b(obj);
            }
            BroadcastResultPictureView.this.f24066x.I.r();
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.result.BroadcastResultPictureView$bind$2", f = "BroadcastResultPictureView.kt", l = {143}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends l implements p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f24070w;

        public d(ao.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new d(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f24070w;
            if (i10 == 0) {
                m.b(obj);
                this.f24070w = 1;
                if (b1.a(6000L, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                m.b(obj);
            }
            BroadcastResultPictureView.this.f24066x.I.r();
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.result.BroadcastResultPictureView$bind$3", f = "BroadcastResultPictureView.kt", l = {161}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class e extends l implements p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f24072w;

        public e(ao.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new e(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((e) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f24072w;
            if (i10 == 0) {
                m.b(obj);
                this.f24072w = 1;
                if (b1.a(6000L, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                m.b(obj);
            }
            BroadcastResultPictureView.this.f24066x.I.r();
            return v.f59242a;
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.result.BroadcastResultPictureView$bind$4", f = "BroadcastResultPictureView.kt", l = {179}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class f extends l implements p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f24074w;

        public f(ao.d<? super f> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new f(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((f) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f24074w;
            if (i10 == 0) {
                m.b(obj);
                this.f24074w = 1;
                if (b1.a(6000L, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                m.b(obj);
            }
            BroadcastResultPictureView.this.f24066x.I.r();
            return v.f59242a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BroadcastResultPictureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b0 b10;
        jo.p.h(context, "context");
        b10 = i2.b(null, 1, null);
        this.f24065w = b10;
        l4 T = l4.T(LayoutInflater.from(getContext()), this, true);
        jo.p.g(T, "inflate(\n        LayoutI… this,\n        true\n    )");
        this.f24066x = T;
    }

    public final void b(BroadcastResult broadcastResult, df.a aVar, boolean z10) {
        Integer b10;
        jo.p.h(broadcastResult, "broadcastResult");
        switch (b.f24067a[broadcastResult.getEventType().ordinal()]) {
            case 1:
                String avatarBackgroundImageUrl = broadcastResult.getUser().getAvatarBackgroundImageUrl();
                if (avatarBackgroundImageUrl.length() == 0) {
                    this.f24066x.E.setBackgroundColor(c3.a.d(getContext(), xb.l.broadcast_result_first_color));
                    break;
                } else {
                    GlideApp.with(this).load(avatarBackgroundImageUrl).centerCrop().into(this.f24066x.E);
                    break;
                }
            case 2:
                this.f24066x.E.setBackgroundColor(c3.a.d(getContext(), xb.l.broadcast_result_first_color));
                LottieAnimationView lottieAnimationView = this.f24066x.U;
                jo.p.g(lottieAnimationView, "binding.titleBoundAnimationView");
                e(lottieAnimationView, "debut_title_bound_lottie");
                LottieAnimationView lottieAnimationView2 = this.f24066x.D;
                jo.p.g(lottieAnimationView2, "binding.backgroundBalloonAnimationView");
                e(lottieAnimationView2, "balloon_back_set_loop_lottie");
                LottieAnimationView lottieAnimationView3 = this.f24066x.I;
                jo.p.g(lottieAnimationView3, "binding.foregroundBalloonAnimationView");
                e(lottieAnimationView3, "balloon_big_set_lottie");
                this.f24066x.U.r();
                this.f24066x.D.r();
                uo.l.d(this, null, null, new c(null), 3, null);
                break;
            case 3:
                this.f24066x.E.setBackground(getContext().getDrawable(n.bg_broadcast_result_every));
                LottieAnimationView lottieAnimationView4 = this.f24066x.U;
                jo.p.g(lottieAnimationView4, "binding.titleBoundAnimationView");
                e(lottieAnimationView4, "7days_title_loop_lottie");
                LottieAnimationView lottieAnimationView5 = this.f24066x.F;
                jo.p.g(lottieAnimationView5, "binding.backgroundPaperAnimationView");
                e(lottieAnimationView5, "paper_s_loop_lottie");
                LottieAnimationView lottieAnimationView6 = this.f24066x.J;
                jo.p.g(lottieAnimationView6, "binding.foregroundPaperAnimationView");
                e(lottieAnimationView6, "paper_L_loop_lottie");
                this.f24066x.U.r();
                this.f24066x.F.r();
                this.f24066x.J.r();
                break;
            case 4:
                this.f24066x.E.setBackground(getContext().getDrawable(n.bg_broadcast_result_every));
                LottieAnimationView lottieAnimationView7 = this.f24066x.U;
                jo.p.g(lottieAnimationView7, "binding.titleBoundAnimationView");
                e(lottieAnimationView7, "30days_title_loop_lottie");
                LottieAnimationView lottieAnimationView8 = this.f24066x.F;
                jo.p.g(lottieAnimationView8, "binding.backgroundPaperAnimationView");
                e(lottieAnimationView8, "paper_s_loop_lottie");
                LottieAnimationView lottieAnimationView9 = this.f24066x.D;
                jo.p.g(lottieAnimationView9, "binding.backgroundBalloonAnimationView");
                e(lottieAnimationView9, "balloon_back_set_loop_lottie");
                LottieAnimationView lottieAnimationView10 = this.f24066x.J;
                jo.p.g(lottieAnimationView10, "binding.foregroundPaperAnimationView");
                e(lottieAnimationView10, "paper_L_loop_lottie");
                LottieAnimationView lottieAnimationView11 = this.f24066x.I;
                jo.p.g(lottieAnimationView11, "binding.foregroundBalloonAnimationView");
                e(lottieAnimationView11, "balloon_big_set_lottie");
                this.f24066x.U.r();
                this.f24066x.F.r();
                this.f24066x.D.r();
                this.f24066x.J.r();
                this.f24066x.I.r();
                break;
            case 5:
                this.f24066x.E.setBackground(getContext().getDrawable(n.bg_broadcast_result_extreme_every));
                LottieAnimationView lottieAnimationView12 = this.f24066x.U;
                jo.p.g(lottieAnimationView12, "binding.titleBoundAnimationView");
                e(lottieAnimationView12, "100days_title_loop_lottie");
                LottieAnimationView lottieAnimationView13 = this.f24066x.F;
                jo.p.g(lottieAnimationView13, "binding.backgroundPaperAnimationView");
                e(lottieAnimationView13, "metal_paper_s_loop_lottie");
                LottieAnimationView lottieAnimationView14 = this.f24066x.D;
                jo.p.g(lottieAnimationView14, "binding.backgroundBalloonAnimationView");
                e(lottieAnimationView14, "metal_balloon_back_set_loop_lottie");
                LottieAnimationView lottieAnimationView15 = this.f24066x.J;
                jo.p.g(lottieAnimationView15, "binding.foregroundPaperAnimationView");
                e(lottieAnimationView15, "metal_paper_L_loop_lottie");
                LottieAnimationView lottieAnimationView16 = this.f24066x.I;
                jo.p.g(lottieAnimationView16, "binding.foregroundBalloonAnimationView");
                e(lottieAnimationView16, "metal_balloon_big_set_lottie");
                this.f24066x.U.r();
                this.f24066x.F.r();
                this.f24066x.D.r();
                this.f24066x.J.r();
                uo.l.d(this, null, null, new d(null), 3, null);
                break;
            case 6:
                this.f24066x.E.setBackground(getContext().getDrawable(n.bg_broadcast_result_kiwami_every));
                LottieAnimationView lottieAnimationView17 = this.f24066x.U;
                jo.p.g(lottieAnimationView17, "binding.titleBoundAnimationView");
                e(lottieAnimationView17, "365days_title_loop_lottie");
                LottieAnimationView lottieAnimationView18 = this.f24066x.F;
                jo.p.g(lottieAnimationView18, "binding.backgroundPaperAnimationView");
                e(lottieAnimationView18, "365_paper_s_loop_lottie");
                LottieAnimationView lottieAnimationView19 = this.f24066x.D;
                jo.p.g(lottieAnimationView19, "binding.backgroundBalloonAnimationView");
                e(lottieAnimationView19, "365_balloon_back_set_loop_lottie");
                LottieAnimationView lottieAnimationView20 = this.f24066x.J;
                jo.p.g(lottieAnimationView20, "binding.foregroundPaperAnimationView");
                e(lottieAnimationView20, "365_paper_L_loop_lottie");
                LottieAnimationView lottieAnimationView21 = this.f24066x.I;
                jo.p.g(lottieAnimationView21, "binding.foregroundBalloonAnimationView");
                e(lottieAnimationView21, "365_balloon_big_set_lottie");
                this.f24066x.U.r();
                this.f24066x.F.r();
                this.f24066x.D.r();
                this.f24066x.J.r();
                uo.l.d(this, null, null, new e(null), 3, null);
                break;
            case 7:
                this.f24066x.E.setBackground(getContext().getDrawable(n.bg_broadcast_result_hall_of_fame_every));
                LottieAnimationView lottieAnimationView22 = this.f24066x.U;
                jo.p.g(lottieAnimationView22, "binding.titleBoundAnimationView");
                e(lottieAnimationView22, "1000days_title_loop_lottie");
                LottieAnimationView lottieAnimationView23 = this.f24066x.F;
                jo.p.g(lottieAnimationView23, "binding.backgroundPaperAnimationView");
                e(lottieAnimationView23, "1000_paper_s_loop_lottie");
                LottieAnimationView lottieAnimationView24 = this.f24066x.D;
                jo.p.g(lottieAnimationView24, "binding.backgroundBalloonAnimationView");
                e(lottieAnimationView24, "1000_balloon_back_set_loop_lottie");
                LottieAnimationView lottieAnimationView25 = this.f24066x.J;
                jo.p.g(lottieAnimationView25, "binding.foregroundPaperAnimationView");
                e(lottieAnimationView25, "1000_paper_L_loop_lottie");
                LottieAnimationView lottieAnimationView26 = this.f24066x.I;
                jo.p.g(lottieAnimationView26, "binding.foregroundBalloonAnimationView");
                e(lottieAnimationView26, "1000_balloon_big_set_lottie");
                this.f24066x.U.r();
                this.f24066x.F.r();
                this.f24066x.D.r();
                this.f24066x.J.r();
                uo.l.d(this, null, null, new f(null), 3, null);
                break;
        }
        String avatarBodyImageUrl = broadcastResult.getUser().getAvatarBodyImageUrl();
        if (avatarBodyImageUrl.length() == 0) {
            this.f24066x.C.setBackground(getContext().getDrawable(n.f59967w0));
        } else {
            GlideApp.with(this).load(avatarBodyImageUrl).centerCrop().into(this.f24066x.C);
        }
        AppCompatTextView appCompatTextView = this.f24066x.L;
        Object[] objArr = new Object[1];
        objArr[0] = Integer.valueOf((aVar == null || (b10 = aVar.b()) == null) ? 0 : b10.intValue());
        String format = String.format("%,d", Arrays.copyOf(objArr, 1));
        jo.p.g(format, "format(this, *args)");
        appCompatTextView.setText(format);
        f(z10, broadcastResult);
        if (d(broadcastResult, z10)) {
            this.f24066x.N.setVisibility(0);
        } else {
            this.f24066x.N.setVisibility(8);
        }
    }

    public final void c(long j10) {
        this.f24066x.P.setVisibility(0);
        this.f24066x.S.setText(of.c.f45387a.c(j10));
    }

    public final boolean d(BroadcastResult broadcastResult, boolean z10) {
        return z10 && broadcastResult.isUpdatedMaxLiveContinuousNum() == 1;
    }

    public final void e(LottieAnimationView lottieAnimationView, String str) {
        lottieAnimationView.setAnimation(str + "/data.json");
        lottieAnimationView.setImageAssetsFolder(str + "/images");
    }

    public final void f(boolean z10, BroadcastResult broadcastResult) {
        int currentLiveContinuousNum = broadcastResult.getCurrentLiveContinuousNum();
        boolean z11 = z10 && broadcastResult.getCurrentLiveContinuousNum() > 0;
        this.f24066x.H.setVisibility(z11 ? 0 : 8);
        this.f24066x.G.setVisibility(z11 ? 0 : 8);
        i0 i0Var = i0.f38149a;
        String string = getResources().getString(r.D0);
        jo.p.g(string, "resources.getString(R.st…every_notifications_days)");
        String format = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(currentLiveContinuousNum)}, 1));
        jo.p.g(format, "format(format, *args)");
        String str = currentLiveContinuousNum + getResources().getString(r.text_time_unit_day);
        int d10 = c3.a.d(getContext(), xb.l.broadcast_result_continuous_day_color);
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(d10), 0, str.length(), 33);
        spannableString.setSpan(new RelativeSizeSpan(1.3f), 0, str.length(), 33);
        spannableString.setSpan(new StyleSpan(1), 0, str.length(), 33);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(format);
        int U = o.U(format, str, 0, false, 6, null);
        spannableStringBuilder.replace(U, str.length() + U, (CharSequence) spannableString);
        this.f24066x.G.setText(spannableStringBuilder);
    }

    @Override // uo.q0
    public g getCoroutineContext() {
        return g1.c().plus(this.f24065w);
    }
}
