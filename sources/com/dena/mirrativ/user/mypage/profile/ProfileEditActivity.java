package com.dena.mirrativ.user.mypage.profile;

import android.app.AlertDialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import androidx.activity.ComponentActivity;
import androidx.appcompat.app.a;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import co.l;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.user.mypage.profile.ProfileEditActivity;
import com.dena.mirrorman.clientlog.logs.MRLog;
import com.dena.mirrorman.net.api.response.RibbonResponse;
import java.lang.reflect.Type;
import java.util.List;
import jd.e;
import jd.s;
import jo.f0;
import jo.p;
import jo.q;
import kotlin.KotlinNothingValueException;
import kq.a;
import nd.w0;
import o3.n0;
import of.n;
import of.r;
import tb.c;
import uo.q0;
import wn.m;
import wn.v;
import xo.w;

/* loaded from: classes2.dex */
public class ProfileEditActivity extends e.b implements jd.h, q0 {
    public static final a W = new a(null);
    public static final int X = 8;
    public final /* synthetic */ da.j O = new da.j();
    public final wn.f P = wn.g.a(new e());
    public final wn.f Q;
    public final wn.f R;
    public final wn.f S;
    public final wn.f T;
    public final androidx.activity.result.c<Intent> U;
    public final androidx.activity.result.c<Intent> V;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final Intent a(Context context, List<RibbonResponse> list) {
            p.h(context, "context");
            p.h(list, "ribbons");
            Intent intent = new Intent(context, ProfileEditActivity.class);
            intent.putExtra("EXTRA_KEY_RIBBONS_JSON", new xm.f().b().s(list));
            return intent;
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.profile.ProfileEditActivity$observeStoreValues$1", f = "ProfileEditActivity.kt", l = {175}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f24745w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<v> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ProfileEditActivity f24747w;

            @co.f(c = "com.dena.mirrativ.user.mypage.profile.ProfileEditActivity$observeStoreValues$1$1", f = "ProfileEditActivity.kt", l = {176}, m = "emit")
            /* renamed from: com.dena.mirrativ.user.mypage.profile.ProfileEditActivity$b$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C0215a extends co.d {

                /* renamed from: w  reason: collision with root package name */
                public Object f24748w;

                /* renamed from: x  reason: collision with root package name */
                public /* synthetic */ Object f24749x;

                /* renamed from: z  reason: collision with root package name */
                public int f24751z;

                public C0215a(ao.d<? super C0215a> dVar) {
                    super(dVar);
                }

                @Override // co.a
                public final Object invokeSuspend(Object obj) {
                    this.f24749x = obj;
                    this.f24751z |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(ProfileEditActivity profileEditActivity) {
                this.f24747w = profileEditActivity;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
            @Override // xo.d
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object emit(wn.v r4, ao.d<? super wn.v> r5) {
                /*
                    r3 = this;
                    boolean r4 = r5 instanceof com.dena.mirrativ.user.mypage.profile.ProfileEditActivity.b.a.C0215a
                    if (r4 == 0) goto L13
                    r4 = r5
                    com.dena.mirrativ.user.mypage.profile.ProfileEditActivity$b$a$a r4 = (com.dena.mirrativ.user.mypage.profile.ProfileEditActivity.b.a.C0215a) r4
                    int r0 = r4.f24751z
                    r1 = -2147483648(0xffffffff80000000, float:-0.0)
                    r2 = r0 & r1
                    if (r2 == 0) goto L13
                    int r0 = r0 - r1
                    r4.f24751z = r0
                    goto L18
                L13:
                    com.dena.mirrativ.user.mypage.profile.ProfileEditActivity$b$a$a r4 = new com.dena.mirrativ.user.mypage.profile.ProfileEditActivity$b$a$a
                    r4.<init>(r5)
                L18:
                    java.lang.Object r5 = r4.f24749x
                    java.lang.Object r0 = bo.c.c()
                    int r1 = r4.f24751z
                    r2 = 1
                    if (r1 == 0) goto L35
                    if (r1 != r2) goto L2d
                    java.lang.Object r4 = r4.f24748w
                    com.dena.mirrativ.user.mypage.profile.ProfileEditActivity$b$a r4 = (com.dena.mirrativ.user.mypage.profile.ProfileEditActivity.b.a) r4
                    wn.m.b(r5)
                    goto L4e
                L2d:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r5)
                    throw r4
                L35:
                    wn.m.b(r5)
                    com.dena.mirrativ.user.mypage.profile.ProfileEditActivity r5 = r3.f24747w
                    of.r r5 = com.dena.mirrativ.user.mypage.profile.ProfileEditActivity.C3(r5)
                    com.dena.mirrativ.user.mypage.profile.ProfileEditActivity r1 = r3.f24747w
                    r4.f24748w = r3
                    r4.f24751z = r2
                    java.lang.String r2 = "profile_edit"
                    java.lang.Object r4 = r5.e(r1, r2, r4)
                    if (r4 != r0) goto L4d
                    return r0
                L4d:
                    r4 = r3
                L4e:
                    com.dena.mirrativ.user.mypage.profile.ProfileEditActivity r5 = r4.f24747w
                    r0 = -1
                    r5.setResult(r0)
                    com.dena.mirrativ.user.mypage.profile.ProfileEditActivity r4 = r4.f24747w
                    r4.finish()
                    wn.v r4 = wn.v.f59242a
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: com.dena.mirrativ.user.mypage.profile.ProfileEditActivity.b.a.emit(wn.v, ao.d):java.lang.Object");
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
            int i10 = this.f24745w;
            if (i10 == 0) {
                m.b(obj);
                w<v> k10 = ProfileEditActivity.this.L3().k();
                a aVar = new a(ProfileEditActivity.this);
                this.f24745w = 1;
                if (k10.a(aVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                m.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.profile.ProfileEditActivity$observeStoreValues$2", f = "ProfileEditActivity.kt", l = {183}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends l implements io.p<q0, ao.d<? super v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f24752w;

        /* loaded from: classes2.dex */
        public static final class a implements xo.d<MRError> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ProfileEditActivity f24754w;

            public a(ProfileEditActivity profileEditActivity) {
                this.f24754w = profileEditActivity;
            }

            @Override // xo.d
            /* renamed from: a */
            public final Object emit(MRError mRError, ao.d<? super v> dVar) {
                n nVar = n.f45411a;
                ProfileEditActivity profileEditActivity = this.f24754w;
                String message = mRError.getMessage();
                if (message == null) {
                    message = this.f24754w.getString(nc.i.f41875e);
                    p.g(message, "getString(R.string.error_access)");
                }
                nVar.B(profileEditActivity, message, false);
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
            int i10 = this.f24752w;
            if (i10 == 0) {
                m.b(obj);
                w<MRError> j10 = ProfileEditActivity.this.L3().j();
                a aVar = new a(ProfileEditActivity.this);
                this.f24752w = 1;
                if (j10.a(aVar, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                m.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends q implements io.p<l0.i, Integer, v> {

        /* loaded from: classes2.dex */
        public static final class a implements s {

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ProfileEditActivity f24756a;

            public a(ProfileEditActivity profileEditActivity) {
                this.f24756a = profileEditActivity;
            }

            public static final void l(ProfileEditActivity profileEditActivity, jd.p pVar, DialogInterface dialogInterface, int i10) {
                p.h(profileEditActivity, "this$0");
                p.h(pVar, "$editModel");
                jd.i H3 = profileEditActivity.H3();
                Uri parse = Uri.parse(pVar.j());
                p.g(parse, "parse(this)");
                H3.k(profileEditActivity, parse, pVar.h(), pVar.e(), pVar.l(), pVar.c(), pVar.k(), Boolean.valueOf(pVar.o()));
            }

            public static final void m(DialogInterface dialogInterface, int i10) {
            }

            @Override // jd.s
            public void a(String str) {
                p.h(str, "url");
                this.f24756a.H3().m(str);
            }

            @Override // jd.s
            public void b(String str) {
                p.h(str, MRLog.PAYLOAD_KEY_DESCRIPTION);
                this.f24756a.H3().g(str);
            }

            @Override // jd.s
            public void c() {
                String c10;
                e.a aVar = jd.e.Q0;
                jd.p f10 = this.f24756a.L3().i().f();
                if (f10 == null || (c10 = f10.c()) == null) {
                    return;
                }
                aVar.a(c10, "").z3(this.f24756a.a3(), "DatePickerDialog");
            }

            @Override // jd.s
            public void d() {
                final jd.p f10 = this.f24756a.L3().i().f();
                if (f10 == null) {
                    return;
                }
                if (f10.m()) {
                    if (f10.c().length() > 0) {
                        AlertDialog.Builder builder = new AlertDialog.Builder(this.f24756a);
                        builder.setMessage(nc.i.text_chat_confirmation_reminder_birthday);
                        builder.setCancelable(true);
                        int i10 = nc.i.text_register;
                        final ProfileEditActivity profileEditActivity = this.f24756a;
                        builder.setPositiveButton(i10, new DialogInterface.OnClickListener() { // from class: jd.m
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i11) {
                                ProfileEditActivity.d.a.l(ProfileEditActivity.this, f10, dialogInterface, i11);
                            }
                        });
                        builder.setNegativeButton(nc.i.B, jd.n.f37630w);
                        AlertDialog create = builder.create();
                        create.show();
                        Button button = create.getButton(-1);
                        ProfileEditActivity profileEditActivity2 = this.f24756a;
                        int i11 = w0.f42242u0;
                        button.setTextColor(profileEditActivity2.getColor(i11));
                        create.getButton(-2).setTextColor(this.f24756a.getColor(i11));
                        return;
                    }
                }
                jd.i H3 = this.f24756a.H3();
                ProfileEditActivity profileEditActivity3 = this.f24756a;
                Uri parse = Uri.parse(f10.j());
                p.g(parse, "parse(this)");
                H3.k(profileEditActivity3, parse, f10.h(), f10.e(), f10.l(), f10.c(), f10.k(), Boolean.valueOf(f10.o()));
            }

            @Override // jd.s
            public void e(String str) {
                p.h(str, "name");
                this.f24756a.H3().i(str);
            }

            @Override // jd.s
            public void f() {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.GET_CONTENT");
                intent.addCategory("android.intent.category.OPENABLE");
                intent.setType("image/*");
                if (intent.resolveActivity(this.f24756a.getApplicationContext().getPackageManager()) != null) {
                    this.f24756a.V.a(intent);
                }
            }

            @Override // jd.s
            public void g(boolean z10) {
                this.f24756a.H3().f(z10);
            }

            @Override // jd.s
            public void h(int i10) {
                this.f24756a.H3().l(i10);
            }

            @Override // jd.s
            public void i() {
                this.f24756a.onBackPressed();
            }
        }

        public d() {
            super(2);
        }

        public final void a(l0.i iVar, int i10) {
            if ((i10 & 11) == 2 && iVar.j()) {
                iVar.I();
            } else {
                jd.q.a(ProfileEditActivity.this.K3(), new a(ProfileEditActivity.this), iVar, 8);
            }
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends q implements io.a<List<? extends RibbonResponse>> {

        /* loaded from: classes2.dex */
        public static final class a extends en.a<List<? extends RibbonResponse>> {
        }

        public e() {
            super(0);
        }

        @Override // io.a
        /* renamed from: a */
        public final List<RibbonResponse> invoke() {
            Type type = new a().getType();
            p.g(type, "object : TypeToken<List<…bonResponse?>?>() {}.type");
            xm.e b10 = new xm.f().b();
            String stringExtra = ProfileEditActivity.this.getIntent().getStringExtra("EXTRA_KEY_RIBBONS_JSON");
            p.e(stringExtra);
            return (List) b10.j(stringExtra, type);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends q implements io.a<r> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24758w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24759x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24760y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24758w = componentCallbacks;
            this.f24759x = aVar;
            this.f24760y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [of.r, java.lang.Object] */
        @Override // io.a
        public final r invoke() {
            ComponentCallbacks componentCallbacks = this.f24758w;
            return gq.a.a(componentCallbacks).c(f0.b(r.class), this.f24759x, this.f24760y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends q implements io.a<tb.c> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24761w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24762x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24763y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24761w = componentCallbacks;
            this.f24762x = aVar;
            this.f24763y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [tb.c, java.lang.Object] */
        @Override // io.a
        public final tb.c invoke() {
            ComponentCallbacks componentCallbacks = this.f24761w;
            return gq.a.a(componentCallbacks).c(f0.b(tb.c.class), this.f24762x, this.f24763y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends q implements io.a<jd.i> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f24764w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f24765x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24766y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f24764w = componentCallbacks;
            this.f24765x = aVar;
            this.f24766y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [jd.i, java.lang.Object] */
        @Override // io.a
        public final jd.i invoke() {
            ComponentCallbacks componentCallbacks = this.f24764w;
            return gq.a.a(componentCallbacks).c(f0.b(jd.i.class), this.f24765x, this.f24766y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class i extends q implements io.a<t0.b> {
        public final /* synthetic */ ComponentActivity A;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ vq.a f24767w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.a f24768x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f24769y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ xq.a f24770z;

        /* loaded from: classes2.dex */
        public static final class a extends q implements io.a<kq.a> {

            /* renamed from: w  reason: collision with root package name */
            public final /* synthetic */ ComponentActivity f24771w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ComponentActivity componentActivity) {
                super(0);
                this.f24771w = componentActivity;
            }

            @Override // io.a
            /* renamed from: a */
            public final kq.a invoke() {
                a.C0552a c0552a = kq.a.f38937c;
                ComponentActivity componentActivity = this.f24771w;
                return c0552a.b(componentActivity, componentActivity);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(vq.a aVar, io.a aVar2, io.a aVar3, xq.a aVar4, ComponentActivity componentActivity) {
            super(0);
            this.f24767w = aVar;
            this.f24768x = aVar2;
            this.f24769y = aVar3;
            this.f24770z = aVar4;
            this.A = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            a aVar = new a(this.A);
            vq.a aVar2 = this.f24767w;
            io.a aVar3 = this.f24768x;
            io.a aVar4 = this.f24769y;
            xq.a aVar5 = this.f24770z;
            kq.a invoke = aVar.invoke();
            return kq.c.a(aVar5, new kq.b(f0.b(jd.r.class), aVar2, aVar4, aVar3, invoke.b(), invoke.a()));
        }
    }

    /* loaded from: classes2.dex */
    public static final class j extends q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentActivity f24772w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ComponentActivity componentActivity) {
            super(0);
            this.f24772w = componentActivity;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = this.f24772w.U();
            p.g(U, "viewModelStore");
            return U;
        }
    }

    public ProfileEditActivity() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.Q = wn.g.b(iVar, new f(this, null, null));
        this.R = wn.g.b(iVar, new g(this, null, null));
        this.S = wn.g.b(iVar, new h(this, null, null));
        this.T = new s0(f0.b(jd.r.class), new j(this), new i(null, null, mq.a.a(), gq.a.a(this), this));
        androidx.activity.result.c<Intent> V2 = V2(new c.c(), new androidx.activity.result.b() { // from class: jd.k
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                ProfileEditActivity.G3(ProfileEditActivity.this, (androidx.activity.result.a) obj);
            }
        });
        p.g(V2, "registerForActivityResul…?.toString() ?: \"\")\n    }");
        this.U = V2;
        androidx.activity.result.c<Intent> V22 = V2(new c.c(), new androidx.activity.result.b() { // from class: jd.l
            @Override // androidx.activity.result.b
            public final void a(Object obj) {
                ProfileEditActivity.F3(ProfileEditActivity.this, (androidx.activity.result.a) obj);
            }
        });
        p.g(V22, "registerForActivityResul…        }\n        }\n    }");
        this.V = V22;
    }

    public static final void F3(ProfileEditActivity profileEditActivity, androidx.activity.result.a aVar) {
        Intent a10;
        Uri data;
        p.h(profileEditActivity, "this$0");
        if (aVar.b() != -1 || (a10 = aVar.a()) == null || (data = a10.getData()) == null) {
            return;
        }
        Intent c10 = c.a.c(profileEditActivity.I3(), profileEditActivity, data, 1.0f, 1.0f, false, 16, null);
        if (c10.resolveActivity(profileEditActivity.getApplicationContext().getPackageManager()) != null) {
            profileEditActivity.U.a(c10);
        }
    }

    public static final void G3(ProfileEditActivity profileEditActivity, androidx.activity.result.a aVar) {
        p.h(profileEditActivity, "this$0");
        if (aVar.b() != -1) {
            return;
        }
        Intent a10 = aVar.a();
        Uri uri = a10 != null ? (Uri) a10.getParcelableExtra("EXTRA_CROPPED_IMAGE_SOURCE") : null;
        profileEditActivity.H3().j((uri == null || (r3 = uri.toString()) == null) ? "" : "");
    }

    public static final void N3(ProfileEditActivity profileEditActivity, DialogInterface dialogInterface, int i10) {
        p.h(profileEditActivity, "this$0");
        profileEditActivity.finish();
    }

    public final jd.i H3() {
        return (jd.i) this.S.getValue();
    }

    public final tb.c I3() {
        return (tb.c) this.R.getValue();
    }

    public final r J3() {
        return (r) this.Q.getValue();
    }

    @Override // jd.h
    public void K2(String str) {
        p.h(str, "date");
        H3().e(str);
    }

    public final List<RibbonResponse> K3() {
        Object value = this.P.getValue();
        p.g(value, "<get-ribbons>(...)");
        return (List) value;
    }

    public final jd.r L3() {
        return (jd.r) this.T.getValue();
    }

    public final void M3() {
        uo.l.d(this, null, null, new b(null), 3, null);
        uo.l.d(this, null, null, new c(null), 3, null);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.O.getCoroutineContext();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (isFinishing()) {
            return;
        }
        jd.p f10 = L3().i().f();
        boolean z10 = true;
        if (f10 == null || !f10.g()) {
            z10 = false;
        }
        if (z10) {
            new a.C0045a(this).f(nc.i.f41892v2).setPositiveButton(nc.i.text_discard, new DialogInterface.OnClickListener() { // from class: jd.j
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    ProfileEditActivity.N3(ProfileEditActivity.this, dialogInterface, i10);
                }
            }).setNegativeButton(nc.i.B, null).k();
        } else {
            super.onBackPressed();
        }
    }

    @Override // androidx.fragment.app.h, androidx.activity.ComponentActivity, b3.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        n0.a(getWindow(), false);
        M3();
        a.a.b(this, null, s0.c.c(-1058899936, true, new d()), 1, null);
    }
}
