package xm;

import com.mirrativ.llstream.protocol.v1.topic.TopicConstant;
import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public abstract class c implements xm.d {
    private static final /* synthetic */ c[] $VALUES;
    public static final c IDENTITY;
    public static final c LOWER_CASE_WITH_DASHES;
    public static final c LOWER_CASE_WITH_DOTS;
    public static final c LOWER_CASE_WITH_UNDERSCORES;
    public static final c UPPER_CAMEL_CASE;
    public static final c UPPER_CAMEL_CASE_WITH_SPACES;

    /* loaded from: classes4.dex */
    public enum a extends c {
        public a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // xm.d
        public String a(Field field) {
            return field.getName();
        }
    }

    static {
        a aVar = new a("IDENTITY", 0);
        IDENTITY = aVar;
        c cVar = new c("UPPER_CAMEL_CASE", 1) { // from class: xm.c.b
            @Override // xm.d
            public String a(Field field) {
                return c.e(field.getName());
            }
        };
        UPPER_CAMEL_CASE = cVar;
        c cVar2 = new c("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: xm.c.c
            @Override // xm.d
            public String a(Field field) {
                return c.e(c.c(field.getName(), " "));
            }
        };
        UPPER_CAMEL_CASE_WITH_SPACES = cVar2;
        c cVar3 = new c("LOWER_CASE_WITH_UNDERSCORES", 3) { // from class: xm.c.d
            @Override // xm.d
            public String a(Field field) {
                return c.c(field.getName(), "_").toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_UNDERSCORES = cVar3;
        c cVar4 = new c("LOWER_CASE_WITH_DASHES", 4) { // from class: xm.c.e
            @Override // xm.d
            public String a(Field field) {
                return c.c(field.getName(), "-").toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_DASHES = cVar4;
        c cVar5 = new c("LOWER_CASE_WITH_DOTS", 5) { // from class: xm.c.f
            @Override // xm.d
            public String a(Field field) {
                return c.c(field.getName(), TopicConstant.SEPARATOR).toLowerCase(Locale.ENGLISH);
            }
        };
        LOWER_CASE_WITH_DOTS = cVar5;
        $VALUES = new c[]{aVar, cVar, cVar2, cVar3, cVar4, cVar5};
    }

    public c(String str, int i10) {
    }

    public static String c(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i10 = 0; i10 < length; i10++) {
            char charAt = str.charAt(i10);
            if (Character.isUpperCase(charAt) && sb2.length() != 0) {
                sb2.append(str2);
            }
            sb2.append(charAt);
        }
        return sb2.toString();
    }

    public static String e(String str) {
        int length = str.length() - 1;
        int i10 = 0;
        while (!Character.isLetter(str.charAt(i10)) && i10 < length) {
            i10++;
        }
        char charAt = str.charAt(i10);
        if (Character.isUpperCase(charAt)) {
            return str;
        }
        char upperCase = Character.toUpperCase(charAt);
        if (i10 == 0) {
            return upperCase + str.substring(1);
        }
        return str.substring(0, i10) + upperCase + str.substring(i10 + 1);
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public /* synthetic */ c(String str, int i10, a aVar) {
        this(str, i10);
    }
}
