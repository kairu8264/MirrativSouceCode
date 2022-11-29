package xc;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.Button;
import androidx.compose.ui.platform.z;
import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import androidx.lifecycle.u0;
import co.l;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.user.ChatStatus;
import jo.f0;
import jo.p;
import jo.q;
import kotlin.KotlinNothingValueException;
import l0.c0;
import l0.c2;
import l0.l1;
import nd.w0;
import of.n;
import uo.q0;
import wn.m;
import wn.v;
import xc.e;
import xo.w;

/* loaded from: classes2.dex */
public final class e {

    /* loaded from: classes2.dex */
    public static final class a extends q implements io.a<u0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ kq.a f60154w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(kq.a aVar) {
            super(0);
            this.f60154w = aVar;
        }

        @Override // io.a
        /* renamed from: a */
        public final u0 invoke() {
            u0 U = this.f60154w.b().U();
            p.g(U, "storeOwner.storeOwner.viewModelStore");
            return U;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b extends q implements io.a<t0.b> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ vq.a f60155w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.a f60156x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ xq.a f60157y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ kq.a f60158z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(vq.a aVar, io.a aVar2, xq.a aVar3, kq.a aVar4) {
            super(0);
            this.f60155w = aVar;
            this.f60156x = aVar2;
            this.f60157y = aVar3;
            this.f60158z = aVar4;
        }

        @Override // io.a
        /* renamed from: a */
        public final t0.b invoke() {
            kq.a aVar = this.f60158z;
            vq.a aVar2 = this.f60155w;
            io.a aVar3 = this.f60156x;
            return kq.c.a(this.f60157y, new kq.b(f0.b(xc.h.class), aVar2, null, aVar3, aVar.b(), aVar.a()));
        }
    }

    @co.f(c = "com.dena.mirrativ.user.mypage.chat.confirmation.datepicker.ChatConfirmationDatePickerPageKt$ChatConfirmationDatePickerPage$1", f = "ChatConfirmationDatePickerPage.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class c extends l implements io.p<q0, ao.d<? super v>, Object> {
        public final /* synthetic */ Context A;
        public final /* synthetic */ io.a<v> B;

        /* renamed from: w  reason: collision with root package name */
        public int f60159w;

        /* renamed from: x  reason: collision with root package name */
        public /* synthetic */ Object f60160x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ xc.h f60161y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ io.l<ChatStatus, v> f60162z;

        @co.f(c = "com.dena.mirrativ.user.mypage.chat.confirmation.datepicker.ChatConfirmationDatePickerPageKt$ChatConfirmationDatePickerPage$1$1", f = "ChatConfirmationDatePickerPage.kt", l = {29}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class a extends l implements io.p<q0, ao.d<? super v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f60163w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ xc.h f60164x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ io.l<ChatStatus, v> f60165y;

            /* renamed from: xc.e$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes2.dex */
            public static final class C1002a implements xo.d<ChatStatus> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ io.l<ChatStatus, v> f60166w;

                /* JADX WARN: Multi-variable type inference failed */
                public C1002a(io.l<? super ChatStatus, v> lVar) {
                    this.f60166w = lVar;
                }

                @Override // xo.d
                /* renamed from: a */
                public final Object emit(ChatStatus chatStatus, ao.d<? super v> dVar) {
                    this.f60166w.invoke(chatStatus);
                    return v.f59242a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(xc.h hVar, io.l<? super ChatStatus, v> lVar, ao.d<? super a> dVar) {
                super(2, dVar);
                this.f60164x = hVar;
                this.f60165y = lVar;
            }

            @Override // co.a
            public final ao.d<v> create(Object obj, ao.d<?> dVar) {
                return new a(this.f60164x, this.f60165y, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
                return ((a) create(q0Var, dVar)).invokeSuspend(v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f60163w;
                if (i10 == 0) {
                    m.b(obj);
                    w<ChatStatus> m10 = this.f60164x.m();
                    C1002a c1002a = new C1002a(this.f60165y);
                    this.f60163w = 1;
                    if (m10.a(c1002a, this) == c10) {
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

        @co.f(c = "com.dena.mirrativ.user.mypage.chat.confirmation.datepicker.ChatConfirmationDatePickerPageKt$ChatConfirmationDatePickerPage$1$2", f = "ChatConfirmationDatePickerPage.kt", l = {34}, m = "invokeSuspend")
        /* loaded from: classes2.dex */
        public static final class b extends l implements io.p<q0, ao.d<? super v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f60167w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ xc.h f60168x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ Context f60169y;

            /* loaded from: classes2.dex */
            public static final class a implements xo.d<MRError> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ Context f60170w;

                public a(Context context) {
                    this.f60170w = context;
                }

                @Override // xo.d
                /* renamed from: a */
                public final Object emit(MRError mRError, ao.d<? super v> dVar) {
                    n nVar = n.f45411a;
                    Context context = this.f60170w;
                    String message = mRError.getMessage();
                    if (message == null) {
                        message = this.f60170w.getString(nc.i.f41875e);
                        p.g(message, "context.getString(R.string.error_access)");
                    }
                    nVar.B(context, message, false);
                    return v.f59242a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(xc.h hVar, Context context, ao.d<? super b> dVar) {
                super(2, dVar);
                this.f60168x = hVar;
                this.f60169y = context;
            }

            @Override // co.a
            public final ao.d<v> create(Object obj, ao.d<?> dVar) {
                return new b(this.f60168x, this.f60169y, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
                return ((b) create(q0Var, dVar)).invokeSuspend(v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f60167w;
                if (i10 == 0) {
                    m.b(obj);
                    w<MRError> l10 = this.f60168x.l();
                    a aVar = new a(this.f60169y);
                    this.f60167w = 1;
                    if (l10.a(aVar, this) == c10) {
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

        @co.f(c = "com.dena.mirrativ.user.mypage.chat.confirmation.datepicker.ChatConfirmationDatePickerPageKt$ChatConfirmationDatePickerPage$1$3", f = "ChatConfirmationDatePickerPage.kt", l = {41}, m = "invokeSuspend")
        /* renamed from: xc.e$c$c  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static final class C1003c extends l implements io.p<q0, ao.d<? super v>, Object> {

            /* renamed from: w  reason: collision with root package name */
            public int f60171w;

            /* renamed from: x  reason: collision with root package name */
            public final /* synthetic */ xc.h f60172x;

            /* renamed from: y  reason: collision with root package name */
            public final /* synthetic */ io.a<v> f60173y;

            /* renamed from: xc.e$c$c$a */
            /* loaded from: classes2.dex */
            public static final class a implements xo.d<v> {

                /* renamed from: w  reason: collision with root package name */
                public final /* synthetic */ io.a<v> f60174w;

                public a(io.a<v> aVar) {
                    this.f60174w = aVar;
                }

                @Override // xo.d
                /* renamed from: a */
                public final Object emit(v vVar, ao.d<? super v> dVar) {
                    this.f60174w.invoke();
                    return v.f59242a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1003c(xc.h hVar, io.a<v> aVar, ao.d<? super C1003c> dVar) {
                super(2, dVar);
                this.f60172x = hVar;
                this.f60173y = aVar;
            }

            @Override // co.a
            public final ao.d<v> create(Object obj, ao.d<?> dVar) {
                return new C1003c(this.f60172x, this.f60173y, dVar);
            }

            @Override // io.p
            public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
                return ((C1003c) create(q0Var, dVar)).invokeSuspend(v.f59242a);
            }

            @Override // co.a
            public final Object invokeSuspend(Object obj) {
                Object c10 = bo.c.c();
                int i10 = this.f60171w;
                if (i10 == 0) {
                    m.b(obj);
                    w<v> j10 = this.f60172x.j();
                    a aVar = new a(this.f60173y);
                    this.f60171w = 1;
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(xc.h hVar, io.l<? super ChatStatus, v> lVar, Context context, io.a<v> aVar, ao.d<? super c> dVar) {
            super(2, dVar);
            this.f60161y = hVar;
            this.f60162z = lVar;
            this.A = context;
            this.B = aVar;
        }

        @Override // co.a
        public final ao.d<v> create(Object obj, ao.d<?> dVar) {
            c cVar = new c(this.f60161y, this.f60162z, this.A, this.B, dVar);
            cVar.f60160x = obj;
            return cVar;
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super v> dVar) {
            return ((c) create(q0Var, dVar)).invokeSuspend(v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            bo.c.c();
            if (this.f60159w == 0) {
                m.b(obj);
                q0 q0Var = (q0) this.f60160x;
                uo.l.d(q0Var, null, null, new a(this.f60161y, this.f60162z, null), 3, null);
                uo.l.d(q0Var, null, null, new b(this.f60161y, this.A, null), 3, null);
                uo.l.d(q0Var, null, null, new C1003c(this.f60161y, this.B, null), 3, null);
                return v.f59242a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* loaded from: classes2.dex */
    public static final class d extends q implements io.l<Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ xc.a f60175w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(xc.a aVar) {
            super(1);
            this.f60175w = aVar;
        }

        public final void a(int i10) {
            this.f60175w.g(i10);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(Integer num) {
            a(num.intValue());
            return v.f59242a;
        }
    }

    /* renamed from: xc.e$e  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static final class C1004e extends q implements io.l<Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ xc.a f60176w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1004e(xc.a aVar) {
            super(1);
            this.f60176w = aVar;
        }

        public final void a(int i10) {
            this.f60176w.f(i10);
        }

        @Override // io.l
        public /* bridge */ /* synthetic */ v invoke(Integer num) {
            a(num.intValue());
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends q implements io.a<v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ Context f60177w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.l<String, v> f60178x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ xc.h f60179y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(Context context, io.l<? super String, v> lVar, xc.h hVar) {
            super(0);
            this.f60177w = context;
            this.f60178x = lVar;
            this.f60179y = hVar;
        }

        public static final void d(io.l lVar, xc.h hVar, DialogInterface dialogInterface, int i10) {
            p.h(lVar, "$onClickRegister");
            p.h(hVar, "$store");
            lVar.invoke(hVar.k().getValue());
        }

        public static final void e(DialogInterface dialogInterface, int i10) {
        }

        public final void c() {
            AlertDialog.Builder builder = new AlertDialog.Builder(this.f60177w, nc.j.f41903f);
            builder.setMessage(nc.i.text_chat_confirmation_reminder_birthday);
            builder.setCancelable(false);
            int i10 = nc.i.text_register;
            final io.l<String, v> lVar = this.f60178x;
            final xc.h hVar = this.f60179y;
            builder.setPositiveButton(i10, new DialogInterface.OnClickListener() { // from class: xc.f
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    e.f.d(io.l.this, hVar, dialogInterface, i11);
                }
            });
            builder.setNegativeButton(nc.i.B, xc.g.f60187w);
            AlertDialog create = builder.create();
            create.show();
            Button button = create.getButton(-1);
            Context context = this.f60177w;
            int i11 = w0.f42242u0;
            button.setTextColor(context.getColor(i11));
            create.getButton(-2).setTextColor(this.f60177w.getColor(i11));
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            c();
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class g extends q implements io.a<v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ xc.a f60180w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(xc.a aVar) {
            super(0);
            this.f60180w = aVar;
        }

        public final void a() {
            this.f60180w.e();
        }

        @Override // io.a
        public /* bridge */ /* synthetic */ v invoke() {
            a();
            return v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class h extends q implements io.p<l0.i, Integer, v> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ io.l<String, v> f60181w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ io.l<ChatStatus, v> f60182x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a<v> f60183y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ int f60184z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(io.l<? super String, v> lVar, io.l<? super ChatStatus, v> lVar2, io.a<v> aVar, int i10) {
            super(2);
            this.f60181w = lVar;
            this.f60182x = lVar2;
            this.f60183y = aVar;
            this.f60184z = i10;
        }

        public final void a(l0.i iVar, int i10) {
            e.a(this.f60181w, this.f60182x, this.f60183y, iVar, this.f60184z | 1);
        }

        @Override // io.p
        public /* bridge */ /* synthetic */ v invoke(l0.i iVar, Integer num) {
            a(iVar, num.intValue());
            return v.f59242a;
        }
    }

    public static final void a(io.l<? super String, v> lVar, io.l<? super ChatStatus, v> lVar2, io.a<v> aVar, l0.i iVar, int i10) {
        int i11;
        p.h(lVar, "onClickRegister");
        p.h(lVar2, "onRegisterDateSucceeded");
        p.h(aVar, "onCancel");
        l0.i h10 = iVar.h(1144637590);
        if ((i10 & 14) == 0) {
            i11 = (h10.P(lVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= h10.P(lVar2) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= h10.P(aVar) ? 256 : 128;
        }
        if ((i11 & 731) == 146 && h10.j()) {
            h10.I();
        } else {
            Context context = (Context) h10.G(z.g());
            h10.x(1509148303);
            pq.b bVar = pq.b.f48484a;
            xq.a b10 = bVar.get().e().b();
            h10.x(-1688186670);
            h10.x(-1688186362);
            kq.a a10 = iq.a.a(h10, 0);
            h10.O();
            h10.x(-3686552);
            boolean P = h10.P(null) | h10.P(null);
            Object y10 = h10.y();
            if (P || y10 == l0.i.f39065a.a()) {
                y10 = new s0(f0.b(xc.h.class), new a(a10), new b(null, null, b10, a10));
                h10.q(y10);
            }
            h10.O();
            h10.O();
            h10.O();
            xc.h hVar = (xc.h) ((androidx.lifecycle.q0) ((s0) y10).getValue());
            h10.x(-909571169);
            xq.a b11 = bVar.get().e().b();
            h10.x(-3686552);
            boolean P2 = h10.P(null) | h10.P(null);
            Object y11 = h10.y();
            if (P2 || y11 == l0.i.f39065a.a()) {
                y11 = b11.c(f0.b(xc.a.class), null, null);
                h10.q(y11);
            }
            h10.O();
            h10.O();
            xc.a aVar2 = (xc.a) y11;
            c0.c(v.f59242a, new c(hVar, lVar2, context, aVar, null), h10, 64);
            i.a(b(hVar.i()), new d(aVar2), new C1004e(aVar2), new f(context, lVar, hVar), new g(aVar2), h10, 8);
        }
        l1 l10 = h10.l();
        if (l10 == null) {
            return;
        }
        l10.a(new h(lVar, lVar2, aVar, i10));
    }

    public static final xc.c b(c2<xc.c> c2Var) {
        return c2Var.getValue();
    }
}
