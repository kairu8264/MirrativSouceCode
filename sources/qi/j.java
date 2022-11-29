package qi;

import android.text.Layout;
import android.widget.ScrollView;
import android.widget.TextView;

/* loaded from: classes3.dex */
public final class j implements Runnable {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ i f49521w;

    public j(i iVar) {
        this.f49521w = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TextView textView;
        int i10;
        TextView textView2;
        ScrollView scrollView;
        textView = this.f49521w.f49520a.R;
        Layout layout = textView.getLayout();
        i10 = this.f49521w.f49520a.S;
        int lineForOffset = layout.getLineForOffset(i10);
        textView2 = this.f49521w.f49520a.R;
        int lineTop = textView2.getLayout().getLineTop(lineForOffset);
        scrollView = this.f49521w.f49520a.Q;
        scrollView.scrollTo(0, lineTop);
    }
}
