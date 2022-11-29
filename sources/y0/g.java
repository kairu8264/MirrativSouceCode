package y0;

import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager;
import jo.p;

/* loaded from: classes.dex */
public final class g extends AutofillManager.AutofillCallback {

    /* renamed from: a  reason: collision with root package name */
    public static final g f61038a = new g();

    public final void a(a aVar) {
        p.h(aVar, "autofill");
        aVar.a().registerCallback(this);
    }

    public final void b(a aVar) {
        p.h(aVar, "autofill");
        aVar.a().unregisterCallback(this);
    }

    @Override // android.view.autofill.AutofillManager.AutofillCallback
    public void onAutofillEvent(View view, int i10, int i11) {
        p.h(view, "view");
        super.onAutofillEvent(view, i10, i11);
        Log.d("Autofill Status", i11 != 1 ? i11 != 2 ? i11 != 3 ? "Unknown status event." : "Autofill popup isn't shown because autofill is not available.\n\nDid you set up autofill?\n1. Go to Settings > System > Languages&input > Advanced > Autofill Service\n2. Pick a service\n\nDid you add an account?\n1. Go to Settings > System > Languages&input > Advanced\n2. Click on the settings icon next to the Autofill Service\n3. Add your account" : "Autofill popup was hidden." : "Autofill popup was shown.");
    }
}
