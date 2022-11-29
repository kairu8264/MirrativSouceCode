package xe;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.e;
import com.cookpad.puree.Puree;
import com.dena.mirrorman.clientlog.logs.Review;
import jo.f0;
import jo.h;
import jo.p;
import jo.q;
import nd.f1;
import of.n;
import wn.f;
import wn.g;
import wn.i;

/* loaded from: classes2.dex */
public final class d extends e {
    public static final a O0 = new a(null);
    public static final int P0 = 8;
    public final f N0 = g.b(i.SYNCHRONIZED, new c(this, null, null));

    /* loaded from: classes2.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(h hVar) {
            this();
        }

        public final d a(String str, boolean z10) {
            p.h(str, "liveID");
            d dVar = new d();
            Bundle bundle = new Bundle();
            bundle.putString("EXTRA_LIVE_ID", str);
            bundle.putBoolean("EXTRA_IS_AFTER_STREAM", z10);
            dVar.V2(bundle);
            return dVar;
        }
    }

    /* loaded from: classes2.dex */
    public interface b {
        void a();

        void q2(String str);
    }

    /* loaded from: classes2.dex */
    public static final class c extends q implements io.a<xe.a> {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ ComponentCallbacks f60252w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ vq.a f60253x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ io.a f60254y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentCallbacks componentCallbacks, vq.a aVar, io.a aVar2) {
            super(0);
            this.f60252w = componentCallbacks;
            this.f60253x = aVar;
            this.f60254y = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [xe.a, java.lang.Object] */
        @Override // io.a
        public final xe.a invoke() {
            ComponentCallbacks componentCallbacks = this.f60252w;
            return gq.a.a(componentCallbacks).c(f0.b(xe.a.class), this.f60253x, this.f60254y);
        }
    }

    public static final void G3(d dVar, DialogInterface dialogInterface, int i10) {
        p.h(dVar, "this$0");
        dVar.F3();
    }

    public static final void H3(d dVar, DialogInterface dialogInterface, int i10) {
        p.h(dVar, "this$0");
        dVar.E3();
    }

    public final xe.a D3() {
        return (xe.a) this.N0.getValue();
    }

    public final void E3() {
        Puree.d(new Review(M2().getString("EXTRA_LIVE_ID", ""), "SatisfactionConfirm.no"));
        D3().c(false);
        n.A(q0(), f1.text_require_review_message_no, true);
        androidx.fragment.app.h j02 = j0();
        b bVar = j02 instanceof b ? (b) j02 : null;
        if (bVar != null) {
            bVar.a();
        }
    }

    public final void F3() {
        Puree.d(new Review(M2().getString("EXTRA_LIVE_ID", ""), "SatisfactionConfirm.yes"));
        D3().c(true);
        androidx.fragment.app.h j02 = j0();
        b bVar = j02 instanceof b ? (b) j02 : null;
        if (bVar != null) {
            bVar.q2(M2().getString("EXTRA_LIVE_ID"));
        }
    }

    @Override // androidx.fragment.app.e, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        p.h(dialogInterface, "dialog");
        super.onCancel(dialogInterface);
        Puree.d(new Review(M2().getString("EXTRA_LIVE_ID", ""), "SatisfactionConfirm.cancel"));
        androidx.fragment.app.h j02 = j0();
        b bVar = j02 instanceof b ? (b) j02 : null;
        if (bVar != null) {
            bVar.a();
        }
    }

    @Override // androidx.fragment.app.e
    public Dialog r3(Bundle bundle) {
        int i10;
        if (M2().getBoolean("EXTRA_IS_AFTER_STREAM")) {
            i10 = f1.text_require_review_content;
        } else {
            i10 = f1.text_require_review_message1_body_ios3;
        }
        AlertDialog create = new AlertDialog.Builder(q0()).setMessage(i10).setPositiveButton(f1.S5, new DialogInterface.OnClickListener() { // from class: xe.b
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                d.G3(d.this, dialogInterface, i11);
            }
        }).setNegativeButton(f1.f41985p3, new DialogInterface.OnClickListener() { // from class: xe.c
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                d.H3(d.this, dialogInterface, i11);
            }
        }).setCancelable(false).create();
        p.g(create, "Builder(context)\n       …se)\n            .create()");
        return create;
    }

    @Override // androidx.fragment.app.e, androidx.fragment.app.Fragment
    public void x1(Context context) {
        p.h(context, "context");
        super.x1(context);
        if (!(context instanceof b)) {
            throw new RuntimeException("Listener is necessary");
        }
    }
}
