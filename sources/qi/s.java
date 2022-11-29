package qi;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import com.google.android.gms.oss.licenses.OssLicensesActivity;

/* loaded from: classes3.dex */
public final class s implements AdapterView.OnItemClickListener {

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.oss.licenses.a f49531w;

    public s(com.google.android.gms.oss.licenses.a aVar) {
        this.f49531w = aVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
        Intent intent = new Intent(this.f49531w.f27297a, OssLicensesActivity.class);
        intent.putExtra("license", (ii.c) adapterView.getItemAtPosition(i10));
        this.f49531w.f27297a.startActivity(intent);
    }
}
