package mc;

import ac.n4;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import android.widget.Toast;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.o;
import com.cookpad.puree.Puree;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrorman.AutoClearedValue;
import com.dena.mirrorman.clientlog.logs.BulkSendLog;
import com.dena.mirrorman.clientlog.logs.BulkSendLogActionType;
import com.dena.mirrorman.net.api.Referer;
import com.dena.mirrorman.net.retrofit.MRRequest;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import hf.v0;
import jo.f0;
import uo.q0;
import uo.r0;

/* loaded from: classes2.dex */
public final class w extends com.google.android.material.bottomsheet.b implements q0 {
    public final /* synthetic */ q0 O0 = r0.b();
    public final wn.f P0;
    public b Q0;
    public final wn.f R0;
    public String S0;
    public final AutoClearedValue T0;
    public static final /* synthetic */ qo.h<Object>[] V0 = {f0.d(new jo.s(w.class, "binding", "getBinding()Lcom/dena/mirrativ/streaming/databinding/ViewBulkSendBinding;", 0))};
    public static final a U0 = new a(null);
    public static final int W0 = 8;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final w a(String str, boolean z10, boolean z11, boolean z12) {
            jo.p.h(str, "liveId");
            w wVar = new w();
            Bundle bundle = new Bundle();
            bundle.putString("ARG_LIVE_ID", str);
            bundle.putBoolean("ARG_ALREADY_SENT_TO_GIFTING_USERS", z10);
            bundle.putBoolean("ARG_ALREADY_SENT_TO_OTHER_USERS", z11);
            bundle.putBoolean("ARG_DISABLE_SEND_TO_GIFTING_USERS_BUTTON", z12);
            wVar.V2(bundle);
            return wVar;
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a();

        void b();
    }

    /* loaded from: classes2.dex */
    public static final class c extends BottomSheetBehavior.g {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Dialog f40838a;

        public c(Dialog dialog) {
            this.f40838a = dialog;
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void a(View view, float f10) {
            jo.p.h(view, "view");
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void b(View view, int i10) {
            jo.p.h(view, "view");
            if ((i10 == 4) || (i10 == 5)) {
                this.f40838a.cancel();
            }
        }
    }

    @co.f(c = "com.dena.mirrativ.streaming.result.BulkSendBottomSheetDialogFragment$postThanks$1", f = "BulkSendBottomSheetDialogFragment.kt", l = {203}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class d extends co.l implements io.p<q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f40839w;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ String f40841y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ String f40842z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2, ao.d<? super d> dVar) {
            super(2, dVar);
            this.f40841y = str;
            this.f40842z = str2;
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new d(this.f40841y, this.f40842z, dVar);
        }

        @Override // io.p
        public final Object invoke(q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((d) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f40839w;
            boolean z10 = true;
            try {
                try {
                    if (i10 == 0) {
                        wn.m.b(obj);
                        MRRequest Y3 = w.this.Y3();
                        String str = this.f40841y;
                        String str2 = this.f40842z.length() == 0 ? null : this.f40842z;
                        String str3 = w.this.S0;
                        this.f40839w = 1;
                        if (Y3.chatPostThanksToLiveWatchedUsersRequest(Referer.Broadcast.RESULT, str, str2, str3, 0, this) == c10) {
                            return c10;
                        }
                    } else if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        wn.m.b(obj);
                    }
                    w.this.X3().t(this.f40842z);
                    of.j.f45405a.c(w.this.q0(), w.this.W3().u());
                    String str4 = w.this.S0;
                    if (jo.p.c(str4, "not_gifting_users")) {
                        w.this.a4();
                    } else if (jo.p.c(str4, BulkSendLog.ONLY_GIFTING_USERS)) {
                        w.this.b4();
                    }
                    if (!w.this.W3().W.isEnabled() && !w.this.W3().V.isEnabled()) {
                        w.this.Z3();
                    }
                    if (jo.p.c(w.this.S0, BulkSendLog.ONLY_GIFTING_USERS)) {
                        b bVar = w.this.Q0;
                        if (bVar != null) {
                            bVar.a();
                        }
                    } else {
                        b bVar2 = w.this.Q0;
                        if (bVar2 != null) {
                            bVar2.b();
                        }
                    }
                    w.this.m4();
                    Puree.d(new BulkSendLog(BulkSendLogActionType.CHAT_POST_THANKS_AT_SAME_TIME, this.f40841y, jo.p.c(w.this.S0, "not_gifting_users") ? BulkSendLog.ALL_USERS : BulkSendLog.ONLY_GIFTING_USERS));
                    if (!jo.p.c(w.this.S0, BulkSendLog.ONLY_GIFTING_USERS) || !w.this.W3().V.isEnabled()) {
                        if (jo.p.c(w.this.S0, "not_gifting_users") && w.this.W3().W.isEnabled()) {
                            w.this.W3().W.performClick();
                        }
                    } else {
                        w.this.W3().V.performClick();
                    }
                } catch (Exception e10) {
                    MRError error = MRErrorKt.convertMRException(e10).getError();
                    if (!(error instanceof MRError.Maintenance)) {
                        z10 = jo.p.c(error, MRError.ForceUpdate.INSTANCE);
                    }
                    if (z10) {
                        of.n.f45411a.l(w.this.q0(), error);
                    } else if (w.this.g().b() != o.c.RESUMED) {
                        wn.v vVar = wn.v.f59242a;
                        w.this.W3().Q.setVisibility(8);
                        w.this.W3().L.setVisibility(0);
                        w.this.W3().T.setVisibility(0);
                        return vVar;
                    } else {
                        of.n nVar = of.n.f45411a;
                        Context q02 = w.this.q0();
                        String message = error.getMessage();
                        if (message == null) {
                            message = w.this.U0(xb.r.f60070c);
                            jo.p.g(message, "getString(R.string.error_access)");
                        }
                        nVar.B(q02, message, false);
                    }
                }
                w.this.W3().Q.setVisibility(8);
                w.this.W3().L.setVisibility(0);
                w.this.W3().T.setVisibility(0);
                return wn.v.f59242a;
            } catch (Throwable th2) {
                w.this.W3().Q.setVisibility(8);
                w.this.W3().L.setVisibility(0);
                w.this.W3().T.setVisibility(0);
                throw th2;
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class e extends jo.q implements io.a<MRRequest> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f40843w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f40844x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f40845y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f40843w = componentCallbacks;
            this.f40844x = aVar;
            this.f40845y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [com.dena.mirrorman.net.retrofit.MRRequest, java.lang.Object] */
        @Override // io.a
        public final MRRequest invoke() {
            ComponentCallbacks componentCallbacks = this.f40843w;
            return gq.a.a(componentCallbacks).c(f0.b(MRRequest.class), this.f40844x, this.f40845y);
        }
    }

    /* loaded from: classes2.dex */
    public static final class f extends jo.q implements io.a<v0> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f40846w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f40847x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f40848y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f40846w = componentCallbacks;
            this.f40847x = aVar;
            this.f40848y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [hf.v0, java.lang.Object] */
        @Override // io.a
        public final v0 invoke() {
            ComponentCallbacks componentCallbacks = this.f40846w;
            return gq.a.a(componentCallbacks).c(f0.b(v0.class), this.f40847x, this.f40848y);
        }
    }

    public w() {
        wn.i iVar = wn.i.SYNCHRONIZED;
        this.P0 = wn.g.b(iVar, new e(this, null, null));
        this.R0 = wn.g.b(iVar, new f(this, null, null));
        this.S0 = BulkSendLog.ONLY_GIFTING_USERS;
        this.T0 = nd.a.a(this);
    }

    public static final void c4(Dialog dialog, DialogInterface dialogInterface) {
        jo.p.h(dialog, "$dialog");
        jo.p.f(dialogInterface, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        View findViewById = ((com.google.android.material.bottomsheet.a) dialogInterface).findViewById(xb.o.f60021p2);
        if (findViewById == null) {
            return;
        }
        BottomSheetBehavior c02 = BottomSheetBehavior.c0(findViewById);
        jo.p.g(c02, "from<View>(bottomSheet)");
        c02.z0(3);
        c02.v0(0);
        c02.n0(new c(dialog));
    }

    public static final void d4(w wVar) {
        jo.p.h(wVar, "this$0");
        wVar.W3().O.scrollTo(0, wVar.W3().O.getHeight());
    }

    public static final void e4(w wVar, View view) {
        jo.p.h(wVar, "this$0");
        wVar.m3();
    }

    public static final boolean f4(w wVar, View view, MotionEvent motionEvent) {
        jo.p.h(wVar, "this$0");
        wVar.W3().Y.getParent().requestDisallowInterceptTouchEvent(true);
        if ((motionEvent.getAction() & 255) == 1) {
            wVar.W3().Y.getParent().requestDisallowInterceptTouchEvent(false);
        }
        return false;
    }

    public static final void g4(w wVar, View view) {
        jo.p.h(wVar, "this$0");
        wVar.W3().W.setBackgroundResource(xb.n.rectangle_stroke_tealish_corner8_transparent_width4);
        wVar.W3().V.setBackgroundResource(xb.n.rectangle_corner8_whitefive_border);
        wVar.W3().T.setText(wVar.V0(xb.r.text_btn_send_thanks, wVar.U0(xb.r.text_btn_send_target_1_no_break)));
        wVar.S0 = BulkSendLog.ONLY_GIFTING_USERS;
    }

    public static final void h4(w wVar, View view) {
        jo.p.h(wVar, "this$0");
        wVar.W3().V.setBackgroundResource(xb.n.rectangle_stroke_tealish_corner8_transparent_width4);
        wVar.W3().W.setBackgroundResource(xb.n.rectangle_corner8_whitefive_border);
        wVar.W3().T.setText(wVar.V0(xb.r.text_btn_send_thanks, wVar.U0(xb.r.text_btn_other_viewer_no_break)));
        wVar.S0 = "not_gifting_users";
    }

    public static final void i4(w wVar, View view) {
        jo.p.h(wVar, "this$0");
        wVar.j4();
    }

    @Override // androidx.fragment.app.Fragment
    public void F1() {
        r0.d(this, null, 1, null);
        super.F1();
    }

    public final void V3() {
        W3().W.setEnabled(false);
        W3().F.setVisibility(0);
    }

    public final n4 W3() {
        return (n4) this.T0.b(this, V0[0]);
    }

    public final v0 X3() {
        return (v0) this.R0.getValue();
    }

    public final MRRequest Y3() {
        return (MRRequest) this.P0.getValue();
    }

    public final void Z3() {
        W3().S.setEnabled(false);
        W3().T.setText(xb.r.text_label_sent_thanks);
        W3().Y.setEnabled(false);
    }

    public final void a4() {
        W3().V.setEnabled(false);
        W3().V.setBackgroundResource(xb.n.rectangle_corner8_whitefive_border);
        W3().G.setVisibility(0);
        W3().C.setVisibility(0);
        W3().E.setVisibility(0);
    }

    public final void b4() {
        V3();
        W3().B.setVisibility(0);
        W3().D.setVisibility(0);
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.O0.getCoroutineContext();
    }

    public final void j4() {
        String string = M2().getString("ARG_LIVE_ID");
        jo.p.e(string);
        String valueOf = String.valueOf(W3().Y.getText());
        W3().Q.setVisibility(0);
        W3().L.setVisibility(8);
        W3().T.setVisibility(8);
        uo.l.d(this, null, null, new d(string, valueOf, null), 3, null);
    }

    public final void k4(n4 n4Var) {
        this.T0.a(this, V0[0], n4Var);
    }

    public final void l4(b bVar) {
        jo.p.h(bVar, "onSendButtonClickListener");
        this.Q0 = bVar;
    }

    public final void m4() {
        String V02;
        Toast toast = new Toast(q0());
        View inflate = D0().inflate(xb.p.f60063s0, (ViewGroup) null);
        if (jo.p.c(this.S0, BulkSendLog.ONLY_GIFTING_USERS)) {
            V02 = V0(xb.r.text_toast_send_thanks, U0(xb.r.text_btn_send_target_1_no_break));
        } else {
            V02 = V0(xb.r.text_toast_send_thanks, U0(xb.r.text_btn_other_viewer_no_break));
        }
        jo.p.g(V02, "if (currentTarget == TAR…)\n            )\n        }");
        TextView textView = (TextView) inflate.findViewById(xb.o.f60004l9);
        textView.setText(V02);
        jo.p.g(textView, "textView");
        textView.setWidth(de.n.b(textView, 220));
        textView.setHeight(de.n.b(textView, 220));
        toast.setGravity(16, 0, 0);
        toast.setDuration(0);
        toast.setView(inflate);
        toast.show();
    }

    @Override // androidx.fragment.app.e
    public int q3() {
        return xb.s.BulkSendBottomSheetDialog;
    }

    @Override // com.google.android.material.bottomsheet.b, e.g, androidx.fragment.app.e
    @SuppressLint({"ClickableViewAccessibility"})
    public Dialog r3(Bundle bundle) {
        final Dialog r32 = super.r3(bundle);
        jo.p.g(r32, "super.onCreateDialog(savedInstanceState)");
        ViewDataBinding e10 = androidx.databinding.f.e(LayoutInflater.from(q0()), xb.p.view_bulk_send, null, false);
        jo.p.g(e10, "inflate(\n            Lay…          false\n        )");
        k4((n4) e10);
        r32.setContentView(W3().u());
        r32.setOnShowListener(new DialogInterface.OnShowListener() { // from class: mc.p
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                w.c4(r32, dialogInterface);
            }
        });
        W3().Y.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: mc.v
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                w.d4(w.this);
            }
        });
        W3().O.setEnabled(false);
        W3().I.setOnClickListener(new View.OnClickListener() { // from class: mc.r
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w.e4(w.this, view);
            }
        });
        W3().Y.setText(X3().f());
        W3().Y.setOnTouchListener(new View.OnTouchListener() { // from class: mc.u
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean f42;
                f42 = w.f4(w.this, view, motionEvent);
                return f42;
            }
        });
        W3().W.setOnClickListener(new View.OnClickListener() { // from class: mc.q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w.g4(w.this, view);
            }
        });
        W3().V.setOnClickListener(new View.OnClickListener() { // from class: mc.s
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w.h4(w.this, view);
            }
        });
        boolean z10 = M2().getBoolean("ARG_ALREADY_SENT_TO_GIFTING_USERS");
        boolean z11 = M2().getBoolean("ARG_ALREADY_SENT_TO_OTHER_USERS");
        boolean z12 = M2().getBoolean("ARG_DISABLE_SEND_TO_GIFTING_USERS_BUTTON");
        if (z10 && z11) {
            b4();
            a4();
            Z3();
        } else if (z11 && z12) {
            V3();
            a4();
            Z3();
        } else if (z11) {
            a4();
            W3().W.performClick();
        } else if (z10) {
            b4();
            W3().V.performClick();
        } else if (z12) {
            V3();
            W3().V.performClick();
        } else {
            W3().W.performClick();
        }
        W3().S.setOnClickListener(new View.OnClickListener() { // from class: mc.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w.i4(w.this, view);
            }
        });
        return r32;
    }
}
