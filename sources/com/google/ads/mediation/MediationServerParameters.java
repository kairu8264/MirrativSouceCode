package com.google.ads.mediation;

import ai.uj0;
import androidx.annotation.RecentlyNonNull;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

@Deprecated
/* loaded from: classes3.dex */
public abstract class MediationServerParameters {

    /* loaded from: classes3.dex */
    public static final class MappingException extends Exception {
        public MappingException(@RecentlyNonNull String str) {
            super(str);
        }
    }

    @Target({ElementType.FIELD})
    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes3.dex */
    public @interface a {
        @RecentlyNonNull
        String name();

        boolean required() default true;
    }

    public void a(@RecentlyNonNull Map<String, String> map) throws MappingException {
        Field[] fields;
        String str;
        HashMap hashMap = new HashMap();
        for (Field field : getClass().getFields()) {
            a aVar = (a) field.getAnnotation(a.class);
            if (aVar != null) {
                hashMap.put(aVar.name(), field);
            }
        }
        if (hashMap.isEmpty()) {
            uj0.f("No server options fields detected. To suppress this message either add a field with the @Parameter annotation, or override the load() method.");
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            Field field2 = (Field) hashMap.remove(entry.getKey());
            if (field2 != null) {
                try {
                    field2.set(this, entry.getValue());
                } catch (IllegalAccessException unused) {
                    String key = entry.getKey();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(key).length() + 49);
                    sb2.append("Server option \"");
                    sb2.append(key);
                    sb2.append("\" could not be set: Illegal Access");
                    uj0.f(sb2.toString());
                } catch (IllegalArgumentException unused2) {
                    String key2 = entry.getKey();
                    StringBuilder sb3 = new StringBuilder(String.valueOf(key2).length() + 43);
                    sb3.append("Server option \"");
                    sb3.append(key2);
                    sb3.append("\" could not be set: Bad Type");
                    uj0.f(sb3.toString());
                }
            } else {
                String key3 = entry.getKey();
                String value = entry.getValue();
                StringBuilder sb4 = new StringBuilder(String.valueOf(key3).length() + 31 + String.valueOf(value).length());
                sb4.append("Unexpected server option: ");
                sb4.append(key3);
                sb4.append(" = \"");
                sb4.append(value);
                sb4.append("\"");
                uj0.a(sb4.toString());
            }
        }
        StringBuilder sb5 = new StringBuilder();
        for (Field field3 : hashMap.values()) {
            if (((a) field3.getAnnotation(a.class)).required()) {
                String valueOf = String.valueOf(((a) field3.getAnnotation(a.class)).name());
                uj0.f(valueOf.length() != 0 ? "Required server option missing: ".concat(valueOf) : new String("Required server option missing: "));
                if (sb5.length() > 0) {
                    sb5.append(", ");
                }
                sb5.append(((a) field3.getAnnotation(a.class)).name());
            }
        }
        if (sb5.length() > 0) {
            String sb6 = sb5.toString();
            if (sb6.length() != 0) {
                str = "Required server option(s) missing: ".concat(sb6);
            } else {
                str = new String("Required server option(s) missing: ");
            }
            throw new MappingException(str);
        }
    }
}
