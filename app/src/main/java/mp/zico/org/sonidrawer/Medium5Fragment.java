package mp.zico.org.sonidrawer;

import android.app.Fragment;
import android.app.FragmentTransaction;

/**
 * Created by zico on 22/06/2016.
 */
public class Medium5Fragment extends SimpleFragment {

    public Medium5Fragment() {
        data.add(20F);
        data.add(40F);
        data.add(60F);
        data.add(40F);
        data.add(30F);
        data.add(20F);
        data.add(40F);
        data.add(60F);
        data.add(40F);
        data.add(30F);
        data.add(20F);
        data.add(40F);
        data.add(60F);
        data.add(40F);
        data.add(30F);
        data.add(20F);
        data.add(40F);
        data.add(60F);
        data.add(40F);
        data.add(30F);
        data.add(20F);
        data.add(40F);
        data.add(30F);
    }

    public void next() {
        Fragment fragment = new Medium6Fragment();
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.content_frame, fragment).commit();
    }
}
