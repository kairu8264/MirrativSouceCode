package sf;

import android.text.InputFilter;
import android.text.Spanned;
import de.l;

/* loaded from: classes3.dex */
public final class b implements InputFilter {

    /* renamed from: a  reason: collision with root package name */
    public final int f52689a;

    public b(int i10) {
        this.f52689a = i10;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i10, int i11, Spanned spanned, int i12, int i13) {
        if (charSequence == null || spanned == null) {
            return null;
        }
        int a10 = l.a(spanned.toString());
        int a11 = l.a(charSequence.toString());
        int i14 = this.f52689a - (a10 - (i13 - i12));
        if (i14 <= 0) {
            return "";
        }
        if (i14 >= a11) {
            return null;
        }
        int i15 = i14 + i10;
        if (Character.isHighSurrogate(charSequence.charAt(i15 - 1))) {
            return charSequence.subSequence(i10, i15 + 1);
        }
        return charSequence.subSequence(i10, i15);
    }
}
