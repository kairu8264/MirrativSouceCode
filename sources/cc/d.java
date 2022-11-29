package cc;

import android.view.MotionEvent;
import android.view.View;
import com.dena.mirrativ.streaming.emomo.CurrentUserGiftRankingViewHolder;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements View.OnTouchListener {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ d f19047w = new d();

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean c10;
        c10 = CurrentUserGiftRankingViewHolder.c(view, motionEvent);
        return c10;
    }
}
