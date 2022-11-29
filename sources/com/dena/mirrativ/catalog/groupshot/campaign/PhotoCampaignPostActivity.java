package com.dena.mirrativ.catalog.groupshot.campaign;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import be.y0;
import com.dena.mirrativ.catalog.groupshot.campaign.PhotoCampaignPostActivity;
import com.dena.mirrativ.customview.StatusView;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrorman.customview.RoundedButtonView;
import com.dena.mirrorman.feature.player.EditTextWithOnKeyPreImeListener;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.glide.GlideApp;
import com.dena.mirrorman.net.glide.GlideRequest;
import com.dena.mirrorman.util.FragmentRunner;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import ha.a;
import java.io.File;
import jo.f0;
import kotlin.KotlinNothingValueException;
import kq.a;
import nd.i1;
import nd.w0;
import r8.f1;
import r8.h1;
import tb.c;
import uo.q0;
import uo.r0;
import vb.u;
import vb.w;
import wn.v;
import yd.g1;

/* loaded from: classes.dex */
public final class PhotoCampaignPostActivity extends e.b implements w, u, q0 {

    /* renamed from: a0  reason: collision with root package name */
    public static final a f20528a0 = new a(null);

    /* renamed from: b0  reason: collision with root package name */
    public static final int f20529b0 = 8;
    public final /* synthetic */ da.j O = new da.j();
    public t8.g P;
    public final wn.f Q;
    public final wn.f R;
    public final wn.f S;
    public final wn.f T;
    public final wn.f U;
    public final FragmentRunner V;
    public final androidx.activity.result.c<Intent> W;
    public final androidx.activity.result.c<Intent> X;
    public Uri Y;
    public boolean Z;

    /* loaded from: classes.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final Intent a(Context context) {
            jo.p.h(context, "context");
            return new Intent(context, PhotoCampaignPostActivity.class);
        }
    }

    @co.f(c = "com.dena.mirrativ.catalog.groupshot.campaign.PhotoCampaignPostActivity$observeStoreValues$3", f = "PhotoCampaignPostActivity.kt", l = {163}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f20530w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<Boolean> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ PhotoCampaignPostActivity f20532w;

            public a(PhotoCampaignPostActivity photoCampaignPostActivity) {
                this.f20532w = photoCampaignPostActivity;
            }

            public final Object a(boolean z10, ao.d<? super v> dVar) {
                if (!z10) {
                    this.f20532w.finish();
                    return v.f59242a;
                }
                if (this.f20532w.S3().a().d()) {
                    this.f20532w.f4();
                } else {
                    this.f20532w.d4();
                }
                return v.f59242a;
            }

            @Override // xo.d
            public /* bridge */ /* synthetic */ Object emit(Boolean bool, ao.d dVar) {
                return a(bool.booleanValue(), dVar);
            }
        }

        public b(ao.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            return new b(dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f20530w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<Boolean> k10 = PhotoCampaignPostActivity.this.T3().k();
                a aVar = new a(PhotoCampaignPostActivity.this);
                this.f20530w = 1;
                if (k10.a(aVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @co.f(c = "com.dena.mirrativ.catalog.groupshot.campaign.PhotoCampaignPostActivity$observeStoreValues$4", f = "PhotoCampaignPostActivity.kt", l = {176}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f20533w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<MRError> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ PhotoCampaignPostActivity f20535w;

            public a(PhotoCampaignPostActivity photoCampaignPostActivity) {
                this.f20535w = photoCampaignPostActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(MRError mRError, ao.d<? super v> dVar) {
                if (mRError instanceof MRError.Failure) {
                    of.n.f45411a.B(this.f20535w, ((MRError.Failure) mRError).getErrorMessage(), false);
                } else if (mRError instanceof MRError.Blocked) {
                    of.n.f45411a.B(this.f20535w, ((MRError.Blocked) mRError).getErrorMessage(), false);
                } else {
                    if (mRError instanceof MRError.ForceUpdate ? true : jo.p.c(mRError, MRError.Maintenance.INSTANCE)) {
                        of.n.f45411a.l(this.f20535w, mRError);
                    } else if (mRError instanceof MRError.Network) {
                        of.n.z(this.f20535w);
                    }
                }
                this.f20535w.finish();
                return v.f59242a;
            }
        }

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
            int i10 = this.f20533w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<MRError> l10 = PhotoCampaignPostActivity.this.T3().l();
                a aVar = new a(PhotoCampaignPostActivity.this);
                this.f20533w = 1;
                if (l10.a(aVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @co.f(c = "com.dena.mirrativ.catalog.groupshot.campaign.PhotoCampaignPostActivity$observeStoreValues$5", f = "PhotoCampaignPostActivity.kt", l = {TsExtractor.TS_PACKET_SIZE}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class d extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f20536w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<Integer> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ PhotoCampaignPostActivity f20538w;

            /* renamed from: com.dena.mirrativ.catalog.groupshot.campaign.PhotoCampaignPostActivity$d$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C0178a extends jo.q implements io.a<v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ PhotoCampaignPostActivity f20539w;

                /* renamed from: x  reason: collision with root package name */
                public final /* synthetic */ int f20540x;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0178a(PhotoCampaignPostActivity photoCampaignPostActivity, int i10) {
                    super(0);
                    this.f20539w = photoCampaignPostActivity;
                    this.f20540x = i10;
                }

                public final void a() {
                    this.f20539w.e4(this.f20540x);
                }

                @Override // io.a
                public /* bridge */ /* synthetic */ v invoke() {
                    a();
                    return v.f59242a;
                }
            }

            public a(PhotoCampaignPostActivity photoCampaignPostActivity) {
                this.f20538w = photoCampaignPostActivity;
            }

            public final Object a(int i10, ao.d<? super v> dVar) {
                if (i10 > 0) {
                    this.f20538w.V.c(new C0178a(this.f20538w, i10));
                } else {
                    u.a.a(this.f20538w, false, 1, null);
                }
                return v.f59242a;
            }

            @Override // xo.d
            public /* bridge */ /* synthetic */ Object emit(Integer num, ao.d dVar) {
                return a(num.intValue(), dVar);
            }
        }

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
            int i10 = this.f20536w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<Integer> m10 = PhotoCampaignPostActivity.this.T3().m();
                a aVar = new a(PhotoCampaignPostActivity.this);
                this.f20536w = 1;
                if (m10.a(aVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @co.f(c = "com.dena.mirrativ.catalog.groupshot.campaign.PhotoCampaignPostActivity$observeStoreValues$6", f = "PhotoCampaignPostActivity.kt", l = {200}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class e extends co.l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f20541w;

        /* loaded from: classes.dex */
        public static final class a implements xo.d<MRError> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ PhotoCampaignPostActivity f20543w;

            public a(PhotoCampaignPostActivity photoCampaignPostActivity) {
                this.f20543w = photoCampaignPostActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(MRError mRError, ao.d<? super v> dVar) {
                if (mRError instanceof MRError.Failure) {
                    of.n.f45411a.B(this.f20543w, ((MRError.Failure) mRError).getErrorMessage(), false);
                } else if (mRError instanceof MRError.Blocked) {
                    of.n.f45411a.B(this.f20543w, ((MRError.Blocked) mRError).getErrorMessage(), false);
                } else {
                    if (mRError instanceof MRError.ForceUpdate ? true : jo.p.c(mRError, MRError.Maintenance.INSTANCE)) {
                        of.n.f45411a.l(this.f20543w, mRError);
                    } else if (mRError instanceof MRError.Network) {
                        of.n nVar = of.n.f45411a;
                        PhotoCampaignPostActivity photoCampaignPostActivity = this.f20543w;
                        nVar.B(photoCampaignPostActivity, photoCampaignPostActivity.getString(h1.text_groupshot_campaign_upload_failed), false);
                    }
                }
                return v.f59242a;
            }
        }

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
            int i10 = this.f20541w;
            if (i10 == 0) {
                wn.m.b(obj);
                xo.w<MRError> n10 = PhotoCampaignPostActivity.this.T3().n();
                a aVar = new a(PhotoCampaignPostActivity.this);
                this.f20541w = 1;
                if (n10.a(aVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* loaded from: classes.dex */
    public static final class f extends jo.q implements io.l<View, v> {
        public f() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            PhotoCampaignPostActivity.this.finish();
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class g extends jo.q implements io.p<Integer, KeyEvent, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ EditTextWithOnKeyPreImeListener f20545w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(EditTextWithOnKeyPreImeListener editTextWithOnKeyPreImeListener) {
            super(2);
            this.f20545w = editTextWithOnKeyPreImeListener;
        }

        public final void a(int i10, KeyEvent keyEvent) {
            jo.p.h(keyEvent, "event");
            if (i10 == 4 && keyEvent.getAction() == 1) {
                this.f20545w.clearFocus();
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(Integer num, KeyEvent keyEvent) {
            a(num.intValue(), keyEvent);
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class h extends jo.q implements io.l<View, v> {
        public h() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            String f10 = PhotoCampaignPostActivity.this.T3().j().f();
            if (f10 == null) {
                return;
            }
            of.f fVar = of.f.f45394a;
            PhotoCampaignPostActivity photoCampaignPostActivity = PhotoCampaignPostActivity.this;
            File a10 = fVar.a(photoCampaignPostActivity, photoCampaignPostActivity.Y);
            if (a10 == null) {
                return;
            }
            t8.g gVar = PhotoCampaignPostActivity.this.P;
            t8.g gVar2 = null;
            if (gVar == null) {
                jo.p.v("binding");
                gVar = null;
            }
            String valueOf = String.valueOf(gVar.F.getText());
            t8.g gVar3 = PhotoCampaignPostActivity.this.P;
            if (gVar3 == null) {
                jo.p.v("binding");
            } else {
                gVar2 = gVar3;
            }
            PhotoCampaignPostActivity.this.P3().i(Referer.GROUPSHOT_CAMPAIGN, f10, a10, valueOf, gVar2.S.isChecked());
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class i extends jo.q implements io.l<View, v> {
        public i() {
            super(1);
        }

        public final void a(View view) {
            jo.p.h(view, "it");
            y0.a aVar = y0.O0;
            String string = PhotoCampaignPostActivity.this.getString(h1.text_groupshot_campaign_ask_terms_of_service);
            jo.p.g(string, "getString(R.string.text_…ign_ask_terms_of_service)");
            y0.a.b(aVar, string, null, 2, null).z3(PhotoCampaignPostActivity.this.a3(), "ConfirmationPopupDialogFragment");
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(View view) {
            a(view);
            return v.f59242a;
        }
    }

    /* loaded from: classes.dex */
    public static final class j implements TextWatcher {
        public j() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            PhotoCampaignPostActivity.this.h4();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* loaded from: classes.dex */
    public static final class k extends jo.q implements io.a<w8.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f20549w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f20550x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f20551y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f20549w = componentCallbacks;
            this.f20550x = aVar;
            this.f20551y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [w8.a, java.lang.Object] */
        @Override // io.a
        public final w8.a invoke() {
            ComponentCallbacks componentCallbacks = this.f20549w;
            return gq.a.a(componentCallbacks).c(f0.b(w8.a.class), this.f20550x, this.f20551y);
        }
    }

    /* loaded from: classes.dex */
    public static final class l extends jo.q implements io.a<od.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f20552w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f20553x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f20554y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f20552w = componentCallbacks;
            this.f20553x = aVar;
            this.f20554y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, od.b] */
        @Override // io.a
        public final od.b invoke() {
            ComponentCallbacks componentCallbacks = this.f20552w;
            return gq.a.a(componentCallbacks).c(f0.b(od.b.class), this.f20553x, this.f20554y);
        }
    }

    /* loaded from: classes.dex */
    public static final class m extends jo.q implements io.a<i1> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f20555w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f20556x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f20557y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f20555w = componentCallbacks;
            this.f20556x = aVar;
            this.f20557y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, nd.i1] */
        @Override // io.a
        public final i1 invoke() {
            ComponentCallbacks componentCallbacks = this.f20555w;
            return gq.a.a(componentCallbacks).c(f0.b(i1.class), this.f20556x, this.f20557y);
        }
    }

    /* loaded from: classes.dex */
    public static final class n extends jo.q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f20558w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f20559x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f20560y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f20558w = componentCallbacks;
            this.f20559x = aVar;
            this.f20560y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            ComponentCallbacks componentCallbacks = this.f20558w;
            return gq.a.a(componentCallbacks).c(f0.b(tb.c.class), this.f20559x, this.f20560y);
        }
    }

    /* loaded from: classes.dex */
    public static final class o extends jo.q implements io.a<kq.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f20561w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(ComponentActivity componentActivity) {
            super(0);
            this.f20561w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final kq.a invoke() {
            a.C0552a c0552a = kq.a.f38937c;
            ComponentActivity componentActivity = this.f20561w;
            return c0552a.b(componentActivity, componentActivity instanceof y4.e ? componentActivity : null);
        }
    }

    /* loaded from: classes.dex */
    public static final class p extends jo.q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.a f20562w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f20563x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f20564y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f20565z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(io.a aVar, vq.a aVar2, io.a aVar3, xq.a aVar4) {
            super(0);
            this.f20562w = aVar;
            this.f20563x = aVar2;
            this.f20564y = aVar3;
            this.f20565z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            io.a aVar = this.f20562w;
            vq.a aVar2 = this.f20563x;
            io.a aVar3 = this.f20564y;
            xq.a aVar4 = this.f20565z;
            kq.a aVar5 = (kq.a) aVar.invoke();
            return kq.c.a(aVar4, new kq.b(f0.b(w8.k.class), aVar2, null, aVar3, aVar5.b(), aVar5.a()));
        }
    }

    /* loaded from: classes.dex */
    public static final class q extends jo.q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f20566w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(ComponentActivity componentActivity) {
            super(0);
            this.f20566w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = this.f20566w.U();
            jo.p.g(U, "viewModelStore");
            return U;
        }
    }

    public PhotoCampaignPostActivity() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.Q = wn.g.b(iVar, new k(this, null, null));
        this.R = new s0(f0.b(w8.k.class), new q(this), new p(new o(this), null, null, gq.a.a(this)));
        this.S = wn.g.b(iVar, new l(this, null, null));
        this.T = wn.g.b(iVar, new m(this, null, null));
        this.U = wn.g.b(iVar, new n(this, null, null));
        this.V = new FragmentRunner(this);
        androidx.activity.result.c<Intent> V2 = V2(new c.c(), new androidx.activity.result.b() { // from class: w8.g
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                PhotoCampaignPostActivity.this.g4((androidx.activity.result.a) obj);
            }
        });
        jo.p.g(V2, "registerForActivityResul… this::updatePostedImage)");
        this.W = V2;
        androidx.activity.result.c<Intent> V22 = V2(new c.c(), new androidx.activity.result.b() { // from class: w8.h
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                PhotoCampaignPostActivity.this.c4((androidx.activity.result.a) obj);
            }
        });
        jo.p.g(V22, "registerForActivityResul…s::showCropImageActivity)");
        this.X = V22;
    }

    public static final void V3(PhotoCampaignPostActivity photoCampaignPostActivity, Boolean bool) {
        jo.p.h(photoCampaignPostActivity, "this$0");
        t8.g gVar = photoCampaignPostActivity.P;
        t8.g gVar2 = null;
        if (gVar == null) {
            jo.p.v("binding");
            gVar = null;
        }
        ConstraintLayout constraintLayout = gVar.R;
        jo.p.g(bool, "shareTweetEnabled");
        constraintLayout.setVisibility(bool.booleanValue() ? 0 : 8);
        t8.g gVar3 = photoCampaignPostActivity.P;
        if (gVar3 == null) {
            jo.p.v("binding");
        } else {
            gVar2 = gVar3;
        }
        gVar2.S.setChecked(bool.booleanValue());
    }

    public static final void W3(PhotoCampaignPostActivity photoCampaignPostActivity, ha.a aVar) {
        jo.p.h(photoCampaignPostActivity, "this$0");
        t8.g gVar = null;
        if (aVar instanceof a.d) {
            t8.g gVar2 = photoCampaignPostActivity.P;
            if (gVar2 == null) {
                jo.p.v("binding");
            } else {
                gVar = gVar2;
            }
            gVar.U.b(StatusView.b.c.f20791w);
        } else if (aVar instanceof a.b) {
            t8.g gVar3 = photoCampaignPostActivity.P;
            if (gVar3 == null) {
                jo.p.v("binding");
            } else {
                gVar = gVar3;
            }
            gVar.U.b(StatusView.b.C0181b.f20790w);
        }
        photoCampaignPostActivity.h4();
    }

    public static final void Y3(PhotoCampaignPostActivity photoCampaignPostActivity, EditTextWithOnKeyPreImeListener editTextWithOnKeyPreImeListener, View view, boolean z10) {
        jo.p.h(photoCampaignPostActivity, "this$0");
        jo.p.h(editTextWithOnKeyPreImeListener, "$this_apply");
        if (z10) {
            of.j.f45405a.d(photoCampaignPostActivity, editTextWithOnKeyPreImeListener, 100);
        } else {
            of.j.f45405a.c(photoCampaignPostActivity, editTextWithOnKeyPreImeListener);
        }
    }

    public static final boolean Z3(EditTextWithOnKeyPreImeListener editTextWithOnKeyPreImeListener, TextView textView, int i10, KeyEvent keyEvent) {
        jo.p.h(editTextWithOnKeyPreImeListener, "$this_apply");
        if (i10 == 6) {
            editTextWithOnKeyPreImeListener.clearFocus();
            return true;
        }
        return false;
    }

    public static final void a4(PhotoCampaignPostActivity photoCampaignPostActivity, CompoundButton compoundButton, boolean z10) {
        jo.p.h(photoCampaignPostActivity, "this$0");
        photoCampaignPostActivity.h4();
    }

    public static final void b4(PhotoCampaignPostActivity photoCampaignPostActivity, CompoundButton compoundButton, boolean z10) {
        jo.p.h(photoCampaignPostActivity, "this$0");
        photoCampaignPostActivity.h4();
    }

    @Override // vb.w
    public void A2() {
        if (this.Z) {
            d4();
        } else {
            finish();
        }
    }

    @Override // vb.u
    public void H2(boolean z10) {
        of.n.f45411a.B(this, getString(h1.text_groupshot_campaign_upload_succeeded), false);
        setResult(-1);
        finish();
    }

    public final w8.a P3() {
        return (w8.a) this.Q.getValue();
    }

    public final od.b Q3() {
        return (od.b) this.S.getValue();
    }

    public final tb.c R3() {
        return (tb.c) this.U.getValue();
    }

    public final i1 S3() {
        return (i1) this.T.getValue();
    }

    public final w8.k T3() {
        return (w8.k) this.R.getValue();
    }

    public final void U3() {
        T3().o().i(this, new androidx.lifecycle.f0() { // from class: w8.j
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                PhotoCampaignPostActivity.V3(PhotoCampaignPostActivity.this, (Boolean) obj);
            }
        });
        T3().p().i(this, new androidx.lifecycle.f0() { // from class: w8.i
            @Override // androidx.lifecycle.f0
            public final void d(Object obj) {
                PhotoCampaignPostActivity.W3(PhotoCampaignPostActivity.this, (ha.a) obj);
            }
        });
        uo.l.d(this, null, null, new b(null), 3, null);
        uo.l.d(this, null, null, new c(null), 3, null);
        uo.l.d(this, null, null, new d(null), 3, null);
        uo.l.d(this, null, null, new e(null), 3, null);
    }

    public final void X3() {
        t8.g gVar = this.P;
        t8.g gVar2 = null;
        if (gVar == null) {
            jo.p.v("binding");
            gVar = null;
        }
        AppCompatImageView appCompatImageView = gVar.E;
        jo.p.g(appCompatImageView, "binding.closeImageView");
        g1.a(appCompatImageView, new f());
        t8.g gVar3 = this.P;
        if (gVar3 == null) {
            jo.p.v("binding");
            gVar3 = null;
        }
        final EditTextWithOnKeyPreImeListener editTextWithOnKeyPreImeListener = gVar3.F;
        editTextWithOnKeyPreImeListener.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: w8.c
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                PhotoCampaignPostActivity.Y3(PhotoCampaignPostActivity.this, editTextWithOnKeyPreImeListener, view, z10);
            }
        });
        jo.p.g(editTextWithOnKeyPreImeListener, "");
        editTextWithOnKeyPreImeListener.addTextChangedListener(new j());
        editTextWithOnKeyPreImeListener.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: w8.f
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i10, KeyEvent keyEvent) {
                boolean Z3;
                Z3 = PhotoCampaignPostActivity.Z3(EditTextWithOnKeyPreImeListener.this, textView, i10, keyEvent);
                return Z3;
            }
        });
        editTextWithOnKeyPreImeListener.setOnKeyPreImeListener(new g(editTextWithOnKeyPreImeListener));
        t8.g gVar4 = this.P;
        if (gVar4 == null) {
            jo.p.v("binding");
            gVar4 = null;
        }
        gVar4.F.setFilters(new InputFilter[]{new sf.b(30)});
        t8.g gVar5 = this.P;
        if (gVar5 == null) {
            jo.p.v("binding");
            gVar5 = null;
        }
        gVar5.B.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: w8.d
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                PhotoCampaignPostActivity.a4(PhotoCampaignPostActivity.this, compoundButton, z10);
            }
        });
        t8.g gVar6 = this.P;
        if (gVar6 == null) {
            jo.p.v("binding");
            gVar6 = null;
        }
        gVar6.S.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: w8.e
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
                PhotoCampaignPostActivity.b4(PhotoCampaignPostActivity.this, compoundButton, z10);
            }
        });
        t8.g gVar7 = this.P;
        if (gVar7 == null) {
            jo.p.v("binding");
            gVar7 = null;
        }
        RoundedButtonView roundedButtonView = gVar7.Y;
        jo.p.g(roundedButtonView, "binding.uploadButtonView");
        g1.a(roundedButtonView, new h());
        t8.g gVar8 = this.P;
        if (gVar8 == null) {
            jo.p.v("binding");
        } else {
            gVar2 = gVar8;
        }
        RoundedButtonView roundedButtonView2 = gVar2.J;
        jo.p.g(roundedButtonView2, "binding.disabledUploadButtonView");
        g1.a(roundedButtonView2, new i());
        h4();
    }

    public final void c4(androidx.activity.result.a aVar) {
        Uri data;
        if (aVar.b() != -1) {
            finish();
            return;
        }
        Intent a10 = aVar.a();
        if (a10 != null && (data = a10.getData()) != null) {
            Intent v02 = R3().v0(this, data, 1.0f, 1.0f, true);
            if (v02.resolveActivity(getApplicationContext().getPackageManager()) != null) {
                this.W.a(v02);
            }
        }
        Q3().J();
    }

    public final void d4() {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("image/*");
        if (intent.resolveActivity(getApplicationContext().getPackageManager()) != null) {
            this.X.a(intent);
        }
    }

    public final void e4(int i10) {
        tb.c R3 = R3();
        String string = getString(h1.text_coin, new Object[]{String.valueOf(i10)});
        jo.p.g(string, "getString(R.string.text_coin, coinNum.toString())");
        tb.a h10 = c.a.h(R3, string, null, null, false, 12, null);
        h10.a().z3(a3(), h10.b());
    }

    public final void f4() {
        this.Z = false;
        tb.a j10 = R3().j(getString(h1.text_album_caution));
        j10.a().z3(a3(), j10.b());
    }

    public final void g4(androidx.activity.result.a aVar) {
        if (aVar.b() != -1) {
            finish();
            return;
        }
        Intent a10 = aVar.a();
        t8.g gVar = null;
        Uri uri = a10 != null ? (Uri) a10.getParcelableExtra("EXTRA_CROPPED_IMAGE_SOURCE") : null;
        this.Y = uri;
        if (uri == null) {
            finish();
            return;
        }
        t8.g gVar2 = this.P;
        if (gVar2 == null) {
            jo.p.v("binding");
            gVar2 = null;
        }
        gVar2.I.setVisibility(0);
        GlideRequest<Drawable> apply = GlideApp.with((androidx.fragment.app.h) this).load(this.Y).apply((e8.a<?>) e8.h.bitmapTransform(new xd.d(de.a.b(this, 12), de.a.b(this, 3), c3.a.d(this, w0.U0))));
        t8.g gVar3 = this.P;
        if (gVar3 == null) {
            jo.p.v("binding");
        } else {
            gVar = gVar3;
        }
        apply.into(gVar.P);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.O.getCoroutineContext();
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d0, code lost:
        if ((T3().p().f() instanceof ha.a.d) != false) goto L46;
     */
    @android.annotation.SuppressLint({"SetTextI18n"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h4() {
        /*
            Method dump skipped, instructions count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.catalog.groupshot.campaign.PhotoCampaignPostActivity.h4():void");
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, b3.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ViewDataBinding g10 = androidx.databinding.f.g(this, f1.activity_photo_campaign_post);
        jo.p.g(g10, "setContentView(this, R.l…vity_photo_campaign_post)");
        this.P = (t8.g) g10;
        X3();
        U3();
        P3().h(Referer.GROUPSHOT_CAMPAIGN);
    }

    @Override // e.b, androidx.fragment.app.h, android.app.Activity
    public void onDestroy() {
        r0.d(this, null, 1, null);
        super.onDestroy();
    }

    @Override // vb.w
    public void t0() {
        this.Z = true;
    }
}
