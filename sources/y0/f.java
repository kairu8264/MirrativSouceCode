package y0;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import jo.p;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f61037a = new f();

    public final AutofillId a(ViewStructure viewStructure) {
        p.h(viewStructure, "structure");
        return viewStructure.getAutofillId();
    }

    public final boolean b(AutofillValue autofillValue) {
        p.h(autofillValue, "value");
        return autofillValue.isDate();
    }

    public final boolean c(AutofillValue autofillValue) {
        p.h(autofillValue, "value");
        return autofillValue.isList();
    }

    public final boolean d(AutofillValue autofillValue) {
        p.h(autofillValue, "value");
        return autofillValue.isText();
    }

    public final boolean e(AutofillValue autofillValue) {
        p.h(autofillValue, "value");
        return autofillValue.isToggle();
    }

    public final void f(ViewStructure viewStructure, String[] strArr) {
        p.h(viewStructure, "structure");
        p.h(strArr, "hints");
        viewStructure.setAutofillHints(strArr);
    }

    public final void g(ViewStructure viewStructure, AutofillId autofillId, int i10) {
        p.h(viewStructure, "structure");
        p.h(autofillId, "parent");
        viewStructure.setAutofillId(autofillId, i10);
    }

    public final void h(ViewStructure viewStructure, int i10) {
        p.h(viewStructure, "structure");
        viewStructure.setAutofillType(i10);
    }

    public final CharSequence i(AutofillValue autofillValue) {
        p.h(autofillValue, "value");
        CharSequence textValue = autofillValue.getTextValue();
        p.g(textValue, "value.textValue");
        return textValue;
    }
}
