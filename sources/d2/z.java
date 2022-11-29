package d2;

/* loaded from: classes.dex */
public final class z extends l {
    public final k0 D;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && jo.p.c(this.D, ((z) obj).D);
    }

    public final k0 f() {
        return this.D;
    }

    public int hashCode() {
        return this.D.hashCode();
    }

    public String toString() {
        return "LoadedFontFamily(typeface=" + this.D + ')';
    }
}
