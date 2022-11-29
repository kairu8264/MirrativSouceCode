package aq;

import java.io.Serializable;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes4.dex */
public class b implements Serializable {

    /* renamed from: w  reason: collision with root package name */
    public Throwable f16655w;

    /* renamed from: x  reason: collision with root package name */
    public List<c> f16656x = new ArrayList();

    /* renamed from: y  reason: collision with root package name */
    public List<Object[]> f16657y = new ArrayList();

    /* renamed from: z  reason: collision with root package name */
    public Map<String, Object> f16658z = new HashMap();

    public b(Throwable th2) {
        this.f16655w = th2;
    }

    public void a(c cVar, Object... objArr) {
        this.f16656x.add(cVar);
        this.f16657y.add(a.a(objArr));
    }

    public final String b(Locale locale, String str) {
        StringBuilder sb2 = new StringBuilder();
        int size = this.f16656x.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            sb2.append(new MessageFormat(this.f16656x.get(i11).w0(locale), locale).format(this.f16657y.get(i11)));
            i10++;
            if (i10 < size) {
                sb2.append(str);
            }
        }
        return sb2.toString();
    }

    public String c() {
        return e(Locale.getDefault());
    }

    public String d() {
        return e(Locale.US);
    }

    public String e(Locale locale) {
        return b(locale, ": ");
    }
}
