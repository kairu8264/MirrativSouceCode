package rh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes3.dex */
public final class n {

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final List<String> f51479a;

        /* renamed from: b  reason: collision with root package name */
        public final Object f51480b;

        public /* synthetic */ a(Object obj, y0 y0Var) {
            p.i(obj);
            this.f51480b = obj;
            this.f51479a = new ArrayList();
        }

        public a a(String str, Object obj) {
            List<String> list = this.f51479a;
            p.i(str);
            String valueOf = String.valueOf(obj);
            StringBuilder sb2 = new StringBuilder(str.length() + 1 + valueOf.length());
            sb2.append(str);
            sb2.append("=");
            sb2.append(valueOf);
            list.add(sb2.toString());
            return this;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(100);
            sb2.append(this.f51480b.getClass().getSimpleName());
            sb2.append('{');
            int size = this.f51479a.size();
            for (int i10 = 0; i10 < size; i10++) {
                sb2.append(this.f51479a.get(i10));
                if (i10 < size - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append('}');
            return sb2.toString();
        }
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static a c(Object obj) {
        return new a(obj, null);
    }
}
