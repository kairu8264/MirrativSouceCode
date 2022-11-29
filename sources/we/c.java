package we;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;
import com.dena.mirrativ.mirrativapi.core.MRError;
import com.dena.mirrativ.mirrativapi.core.MRErrorKt;
import com.dena.mirrorman.feature.main.ReportDialogView;
import jo.h;
import jo.p;
import nd.f1;
import nd.g1;
import of.n;

/* loaded from: classes2.dex */
public final class c extends androidx.fragment.app.e {
    public static final a N0 = new a(null);

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final c a(String str, String str2, String str3) {
            p.h(str, "refer");
            p.h(str2, "userId");
            c cVar = new c();
            Bundle bundle = new Bundle();
            bundle.putString("referer", str);
            bundle.putString("userId", str2);
            if (str3 != null) {
                bundle.putString("liveId", str3);
            }
            cVar.V2(bundle);
            return cVar;
        }
    }

    /* loaded from: classes2.dex */
    public static final class b implements qe.f {
        public b() {
        }

        @Override // qe.f
        public void a() {
            n.A(c.this.q0(), f1.U3, false);
            c.this.n3();
        }

        @Override // qe.f
        public void b(Throwable th2) {
            p.h(th2, i7.e.f36387u);
            MRError error = MRErrorKt.convertMRException(th2).getError();
            if (error instanceof MRError.Maintenance ? true : p.c(error, MRError.ForceUpdate.INSTANCE)) {
                n.f45411a.l(c.this.q0(), error);
            } else {
                n nVar = n.f45411a;
                Context q02 = c.this.q0();
                String message = error.getMessage();
                if (message == null) {
                    message = c.this.U0(f1.f41966c);
                    p.g(message, "getString(R.string.error_access)");
                }
                nVar.B(q02, message, false);
            }
            c.this.n3();
        }

        @Override // qe.f
        public void onClose() {
            c.this.n3();
        }
    }

    public static final boolean D3(Dialog dialog, DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        p.h(dialog, "$this_apply");
        if (keyEvent.getAction() == 1 && i10 == 4) {
            dialog.dismiss();
            return true;
        }
        return false;
    }

    public final ReportDialogView C3(Dialog dialog) {
        Context context = dialog.getContext();
        p.g(context, "dialog.context");
        ReportDialogView reportDialogView = new ReportDialogView(context, null, 0, 6, null);
        reportDialogView.setListener(new b());
        Bundle n02 = n0();
        if (n02 != null) {
            String string = n02.getString("referer");
            if (string != null) {
                p.g(string, "checkNotNull(it.getString(ARGS_REFERER_KEY))");
                String string2 = n02.getString("userId");
                if (string2 != null) {
                    p.g(string2, "checkNotNull(it.getString(ARGS_USER_ID_KEY))");
                    reportDialogView.setArguments(new qe.a(string, string2, n02.getString("liveId")));
                } else {
                    throw new IllegalStateException("Required value was null.".toString());
                }
            } else {
                throw new IllegalStateException("Required value was null.".toString());
            }
        }
        return reportDialogView;
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        final Dialog dialog = new Dialog(N2(), g1.f42008g);
        dialog.setContentView(C3(dialog));
        dialog.setCancelable(true);
        dialog.setCanceledOnTouchOutside(true);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -2);
        }
        dialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: we.b
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
                boolean D3;
                D3 = c.D3(dialog, dialogInterface, i10, keyEvent);
                return D3;
            }
        });
        return dialog;
    }
}
