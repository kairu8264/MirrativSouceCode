package kk;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import java.util.Objects;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes3.dex */
public final class h {

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f38845a;

        /* renamed from: b  reason: collision with root package name */
        public final a f38846b;

        /* renamed from: c  reason: collision with root package name */
        public a f38847c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f38848d;

        /* loaded from: classes3.dex */
        public static final class a {
            @NullableDecl

            /* renamed from: a  reason: collision with root package name */
            public String f38849a;
            @NullableDecl

            /* renamed from: b  reason: collision with root package name */
            public Object f38850b;
            @NullableDecl

            /* renamed from: c  reason: collision with root package name */
            public a f38851c;

            public a() {
            }
        }

        @CanIgnoreReturnValue
        public b a(String str, int i10) {
            return e(str, String.valueOf(i10));
        }

        @CanIgnoreReturnValue
        public b b(String str, @NullableDecl Object obj) {
            return e(str, obj);
        }

        public final a c() {
            a aVar = new a();
            this.f38847c.f38851c = aVar;
            this.f38847c = aVar;
            return aVar;
        }

        public final b d(@NullableDecl Object obj) {
            c().f38850b = obj;
            return this;
        }

        public final b e(String str, @NullableDecl Object obj) {
            a c10 = c();
            c10.f38850b = obj;
            c10.f38849a = (String) j.i(str);
            return this;
        }

        @CanIgnoreReturnValue
        public b f(@NullableDecl Object obj) {
            return d(obj);
        }

        public String toString() {
            boolean z10 = this.f38848d;
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append(this.f38845a);
            sb2.append('{');
            String str = "";
            for (a aVar = this.f38846b.f38851c; aVar != null; aVar = aVar.f38851c) {
                Object obj = aVar.f38850b;
                if (!z10 || obj != null) {
                    sb2.append(str);
                    String str2 = aVar.f38849a;
                    if (str2 != null) {
                        sb2.append(str2);
                        sb2.append('=');
                    }
                    if (obj != null && obj.getClass().isArray()) {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb2.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    } else {
                        sb2.append(obj);
                    }
                    str = ", ";
                }
            }
            sb2.append('}');
            return sb2.toString();
        }

        public b(String str) {
            a aVar = new a();
            this.f38846b = aVar;
            this.f38847c = aVar;
            this.f38848d = false;
            this.f38845a = (String) j.i(str);
        }
    }

    public static <T> T a(@NullableDecl T t10, @NullableDecl T t11) {
        if (t10 != null) {
            return t10;
        }
        Objects.requireNonNull(t11, "Both parameters are null");
        return t11;
    }

    public static b b(Object obj) {
        return new b(obj.getClass().getSimpleName());
    }
}
