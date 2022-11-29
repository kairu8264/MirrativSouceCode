package x3;

import android.text.Editable;
import android.text.Spanned;
import android.text.TextWatcher;
import android.widget.TextView;
import androidx.databinding.g;

/* loaded from: classes.dex */
public class e {

    /* loaded from: classes.dex */
    public class a implements TextWatcher {

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ c f59658w;

        /* renamed from: x  reason: collision with root package name */
        public final /* synthetic */ d f59659x;

        /* renamed from: y  reason: collision with root package name */
        public final /* synthetic */ g f59660y;

        /* renamed from: z  reason: collision with root package name */
        public final /* synthetic */ b f59661z;

        public a(c cVar, d dVar, g gVar, b bVar) {
            this.f59658w = cVar;
            this.f59659x = dVar;
            this.f59660y = gVar;
            this.f59661z = bVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            b bVar = this.f59661z;
            if (bVar != null) {
                bVar.afterTextChanged(editable);
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            c cVar = this.f59658w;
            if (cVar != null) {
                cVar.beforeTextChanged(charSequence, i10, i11, i12);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            d dVar = this.f59659x;
            if (dVar != null) {
                dVar.onTextChanged(charSequence, i10, i11, i12);
            }
            g gVar = this.f59660y;
            if (gVar != null) {
                gVar.a();
            }
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        void afterTextChanged(Editable editable);
    }

    /* loaded from: classes.dex */
    public interface c {
        void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12);
    }

    /* loaded from: classes.dex */
    public interface d {
        void onTextChanged(CharSequence charSequence, int i10, int i11, int i12);
    }

    public static String a(TextView textView) {
        return textView.getText().toString();
    }

    public static boolean b(CharSequence charSequence, CharSequence charSequence2) {
        if ((charSequence == null) != (charSequence2 == null)) {
            return true;
        }
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        if (length != charSequence2.length()) {
            return true;
        }
        for (int i10 = 0; i10 < length; i10++) {
            if (charSequence.charAt(i10) != charSequence2.charAt(i10)) {
                return true;
            }
        }
        return false;
    }

    public static void c(TextView textView, CharSequence charSequence) {
        CharSequence text = textView.getText();
        if (charSequence != text) {
            if (charSequence == null && text.length() == 0) {
                return;
            }
            if (charSequence instanceof Spanned) {
                if (charSequence.equals(text)) {
                    return;
                }
            } else if (!b(charSequence, text)) {
                return;
            }
            textView.setText(charSequence);
        }
    }

    public static void d(TextView textView, float f10) {
        textView.setTextSize(0, f10);
    }

    public static void e(TextView textView, c cVar, d dVar, b bVar, g gVar) {
        a aVar = (cVar == null && bVar == null && dVar == null && gVar == null) ? null : new a(cVar, dVar, gVar, bVar);
        TextWatcher textWatcher = (TextWatcher) x3.c.a(textView, aVar, z3.a.f62502a);
        if (textWatcher != null) {
            textView.removeTextChangedListener(textWatcher);
        }
        if (aVar != null) {
            textView.addTextChangedListener(aVar);
        }
    }
}
