package so;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import xn.r;

/* loaded from: classes4.dex */
public final class e implements Serializable {

    /* renamed from: x  reason: collision with root package name */
    public static final a f52788x = new a(null);

    /* renamed from: w  reason: collision with root package name */
    public final Pattern f52789w;

    /* loaded from: classes4.dex */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(jo.h hVar) {
            this();
        }
    }

    public e(Pattern pattern) {
        jo.p.h(pattern, "nativePattern");
        this.f52789w = pattern;
    }

    public final boolean a(CharSequence charSequence) {
        jo.p.h(charSequence, "input");
        return this.f52789w.matcher(charSequence).matches();
    }

    public final String b(CharSequence charSequence, String str) {
        jo.p.h(charSequence, "input");
        jo.p.h(str, "replacement");
        String replaceAll = this.f52789w.matcher(charSequence).replaceAll(str);
        jo.p.g(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }

    public final String c(CharSequence charSequence, String str) {
        jo.p.h(charSequence, "input");
        jo.p.h(str, "replacement");
        String replaceFirst = this.f52789w.matcher(charSequence).replaceFirst(str);
        jo.p.g(replaceFirst, "nativePattern.matcher(in…replaceFirst(replacement)");
        return replaceFirst;
    }

    public final List<String> d(CharSequence charSequence, int i10) {
        jo.p.h(charSequence, "input");
        o.m0(i10);
        Matcher matcher = this.f52789w.matcher(charSequence);
        if (i10 != 1 && matcher.find()) {
            ArrayList arrayList = new ArrayList(i10 > 0 ? po.n.i(i10, 10) : 10);
            int i11 = 0;
            int i12 = i10 - 1;
            do {
                arrayList.add(charSequence.subSequence(i11, matcher.start()).toString());
                i11 = matcher.end();
                if (i12 >= 0 && arrayList.size() == i12) {
                    break;
                }
            } while (matcher.find());
            arrayList.add(charSequence.subSequence(i11, charSequence.length()).toString());
            return arrayList;
        }
        return r.d(charSequence.toString());
    }

    public String toString() {
        String pattern = this.f52789w.toString();
        jo.p.g(pattern, "nativePattern.toString()");
        return pattern;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public e(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            jo.p.h(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "compile(pattern)"
            jo.p.g(r2, r0)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: so.e.<init>(java.lang.String):void");
    }
}
