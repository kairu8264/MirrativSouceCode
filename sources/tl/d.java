package tl;

/* loaded from: classes4.dex */
public @interface d {

    /* loaded from: classes4.dex */
    public enum a {
        DEFAULT,
        SIGNED,
        FIXED
    }

    a intEncoding() default a.DEFAULT;

    int tag();
}
