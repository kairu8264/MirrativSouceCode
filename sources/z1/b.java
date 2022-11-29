package z1;

import java.text.CharacterIterator;

/* loaded from: classes.dex */
public final class b implements CharacterIterator {

    /* renamed from: w  reason: collision with root package name */
    public final CharSequence f62429w;

    /* renamed from: x  reason: collision with root package name */
    public final int f62430x;

    /* renamed from: y  reason: collision with root package name */
    public final int f62431y;

    /* renamed from: z  reason: collision with root package name */
    public int f62432z;

    public b(CharSequence charSequence, int i10, int i11) {
        jo.p.h(charSequence, "charSequence");
        this.f62429w = charSequence;
        this.f62430x = i10;
        this.f62431y = i11;
        this.f62432z = i10;
    }

    @Override // java.text.CharacterIterator
    public Object clone() {
        try {
            Object clone = super.clone();
            jo.p.g(clone, "{\n            @Suppress(…  super.clone()\n        }");
            return clone;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public char current() {
        int i10 = this.f62432z;
        if (i10 == this.f62431y) {
            return (char) 65535;
        }
        return this.f62429w.charAt(i10);
    }

    @Override // java.text.CharacterIterator
    public char first() {
        this.f62432z = this.f62430x;
        return current();
    }

    @Override // java.text.CharacterIterator
    public int getBeginIndex() {
        return this.f62430x;
    }

    @Override // java.text.CharacterIterator
    public int getEndIndex() {
        return this.f62431y;
    }

    @Override // java.text.CharacterIterator
    public int getIndex() {
        return this.f62432z;
    }

    @Override // java.text.CharacterIterator
    public char last() {
        int i10 = this.f62430x;
        int i11 = this.f62431y;
        if (i10 == i11) {
            this.f62432z = i11;
            return (char) 65535;
        }
        int i12 = i11 - 1;
        this.f62432z = i12;
        return this.f62429w.charAt(i12);
    }

    @Override // java.text.CharacterIterator
    public char next() {
        int i10 = this.f62432z + 1;
        this.f62432z = i10;
        int i11 = this.f62431y;
        if (i10 >= i11) {
            this.f62432z = i11;
            return (char) 65535;
        }
        return this.f62429w.charAt(i10);
    }

    @Override // java.text.CharacterIterator
    public char previous() {
        int i10 = this.f62432z;
        if (i10 <= this.f62430x) {
            return (char) 65535;
        }
        int i11 = i10 - 1;
        this.f62432z = i11;
        return this.f62429w.charAt(i11);
    }

    @Override // java.text.CharacterIterator
    public char setIndex(int i10) {
        int i11 = this.f62430x;
        boolean z10 = false;
        if (i10 <= this.f62431y && i11 <= i10) {
            z10 = true;
        }
        if (z10) {
            this.f62432z = i10;
            return current();
        }
        throw new IllegalArgumentException("invalid position");
    }
}
