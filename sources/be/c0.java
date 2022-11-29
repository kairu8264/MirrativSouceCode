package be;

import android.animation.Animator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import com.google.android.exoplayer2.upstream.DefaultLoadErrorHandlingPolicy;
import sf.i;

/* loaded from: classes2.dex */
public final class c0 extends androidx.fragment.app.e implements uo.q0 {
    public static final a P0 = new a(null);
    public static final int Q0 = 8;
    public final /* synthetic */ da.j N0;
    public vb.l O0;

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }

        public final c0 a() {
            return new c0();
        }
    }

    @co.f(c = "com.dena.mirrorman.dialog.CollabMatchingWaitingDialog$onViewCreated$1", f = "CollabMatchingWaitingDialog.kt", l = {59}, m = "invokeSuspend")
    /* loaded from: classes2.dex */
    public static final class b extends co.l implements io.p<uo.q0, ao.d<? super wn.v>, Object> {

        /* renamed from: w  reason: collision with root package name */
        public int f17760w;

        public b(ao.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // co.a
        public final ao.d<wn.v> create(Object obj, ao.d<?> dVar) {
            return new b(dVar);
        }

        @Override // io.p
        public final Object invoke(uo.q0 q0Var, ao.d<? super wn.v> dVar) {
            return ((b) create(q0Var, dVar)).invokeSuspend(wn.v.f59242a);
        }

        @Override // co.a
        public final Object invokeSuspend(Object obj) {
            Object c10 = bo.c.c();
            int i10 = this.f17760w;
            if (i10 == 0) {
                wn.m.b(obj);
                this.f17760w = 1;
                if (uo.b1.a(DefaultLoadErrorHandlingPolicy.DEFAULT_TRACK_BLACKLIST_MS, this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                wn.m.b(obj);
            }
            vb.l lVar = c0.this.O0;
            if (lVar != null) {
                lVar.l0();
            }
            c0.this.n3();
            return wn.v.f59242a;
        }
    }

    /* loaded from: classes2.dex */
    public static final class c implements sf.i {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ae.t1 f17762a;

        public c(ae.t1 t1Var) {
            this.f17762a = t1Var;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            i.a.a(this, animator);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f17762a.E.setVisibility(8);
            this.f17762a.D.setVisibility(0);
            this.f17762a.D.r();
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

    public c0() {
        super(nd.b1.dialog_fragment_collab_matching_waiting_dialog);
        this.N0 = new da.j();
    }

    public static final boolean D3(c0 c0Var, DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        jo.p.h(c0Var, "this$0");
        if (keyEvent.getAction() == 1 && i10 == 4) {
            vb.l lVar = c0Var.O0;
            if (lVar != null) {
                lVar.D0();
            }
            c0Var.n3();
            return true;
        }
        return false;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void I1() {
        this.O0 = null;
        super.I1();
    }

    @Override // androidx.fragment.app.Fragment
    public void e2(View view, Bundle bundle) {
        Window window;
        jo.p.h(view, "view");
        super.e2(view, bundle);
        Dialog p32 = p3();
        if (p32 != null && (window = p32.getWindow()) != null) {
            window.setLayout(de.e.b(this, 280), -2);
        }
        uo.l.d(this, null, null, new b(null), 3, null);
        ae.t1 T = ae.t1.T(view);
        T.E.r();
        T.E.e(new c(T));
    }

    @Override // uo.q0
    public ao.g getCoroutineContext() {
        return this.N0.getCoroutineContext();
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        Dialog dialog = new Dialog(N2(), 16973913);
        w3(false);
        dialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: be.b0
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
                boolean D3;
                D3 = c0.D3(c0.this, dialogInterface, i10, keyEvent);
                return D3;
            }
        });
        return dialog;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        jo.p.h(context, "context");
        super.x1(context);
        this.O0 = context instanceof vb.l ? (vb.l) context : null;
    }
}
