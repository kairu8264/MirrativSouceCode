package h2;

import android.os.LocaleList;
import android.text.style.LocaleSpan;
import g2.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import jo.p;
import xn.t;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static final b f34424a = new b();

    public final Object a(f2.f fVar) {
        p.h(fVar, "localeList");
        ArrayList arrayList = new ArrayList(t.u(fVar, 10));
        Iterator<f2.e> it = fVar.iterator();
        while (it.hasNext()) {
            arrayList.add(a.a(it.next()));
        }
        Object[] array = arrayList.toArray(new Locale[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        Locale[] localeArr = (Locale[]) array;
        return new LocaleSpan(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    public final void b(h hVar, f2.f fVar) {
        p.h(hVar, "textPaint");
        p.h(fVar, "localeList");
        ArrayList arrayList = new ArrayList(t.u(fVar, 10));
        Iterator<f2.e> it = fVar.iterator();
        while (it.hasNext()) {
            arrayList.add(a.a(it.next()));
        }
        Object[] array = arrayList.toArray(new Locale[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        Locale[] localeArr = (Locale[]) array;
        hVar.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }
}
