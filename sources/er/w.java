package er;

import java.lang.annotation.Annotation;

/* loaded from: classes4.dex */
public final class w implements v {

    /* renamed from: a  reason: collision with root package name */
    public static final v f31279a = new w();

    public static Annotation[] a(Annotation[] annotationArr) {
        if (x.l(annotationArr, v.class)) {
            return annotationArr;
        }
        Annotation[] annotationArr2 = new Annotation[annotationArr.length + 1];
        annotationArr2[0] = f31279a;
        System.arraycopy(annotationArr, 0, annotationArr2, 1, annotationArr.length);
        return annotationArr2;
    }

    @Override // java.lang.annotation.Annotation
    public Class<? extends Annotation> annotationType() {
        return v.class;
    }

    @Override // java.lang.annotation.Annotation
    public boolean equals(Object obj) {
        return obj instanceof v;
    }

    @Override // java.lang.annotation.Annotation
    public int hashCode() {
        return 0;
    }

    @Override // java.lang.annotation.Annotation
    public String toString() {
        return "@" + v.class.getName() + "()";
    }
}
