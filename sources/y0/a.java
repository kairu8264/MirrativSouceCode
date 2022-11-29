package y0;

import android.view.View;
import android.view.autofill.AutofillManager;
import jo.p;

/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public final View f61032a;

    /* renamed from: b  reason: collision with root package name */
    public final i f61033b;

    /* renamed from: c  reason: collision with root package name */
    public final AutofillManager f61034c;

    public a(View view, i iVar) {
        p.h(view, "view");
        p.h(iVar, "autofillTree");
        this.f61032a = view;
        this.f61033b = iVar;
        AutofillManager autofillManager = (AutofillManager) view.getContext().getSystemService(AutofillManager.class);
        if (autofillManager != null) {
            this.f61034c = autofillManager;
            view.setImportantForAutofill(1);
            return;
        }
        throw new IllegalStateException("Autofill service could not be located.".toString());
    }

    public final AutofillManager a() {
        return this.f61034c;
    }

    public final i b() {
        return this.f61033b;
    }

    public final View c() {
        return this.f61032a;
    }
}
