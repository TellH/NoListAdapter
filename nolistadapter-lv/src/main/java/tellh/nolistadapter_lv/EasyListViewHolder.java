package tellh.nolistadapter_lv;

import android.text.method.LinkMovementMethod;
import android.util.SparseArray;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class EasyListViewHolder extends ListViewBinder.ViewHolder {
    private SparseArray<View> mViews;

    public EasyListViewHolder(View itemView) {
        super(itemView);
        mViews = new SparseArray<>();
    }

    @Override
    protected <T extends View> T findViewById(int viewId) {
        View view = mViews.get(viewId);
        if (view == null) {
            view = itemView.findViewById(viewId);
            mViews.put(viewId, view);
        }
        return (T) view;
    }

    public View getView(int viewId) {
        return findViewById(viewId);
    }

    public TextView getTextView(int viewId) {
        return (TextView) getView(viewId);
    }

    public Button getButton(int viewId) {
        return (Button) getView(viewId);
    }

    public ImageView getImageView(int viewId) {
        return (ImageView) getView(viewId);
    }

    public ImageButton getImageButton(int viewId) {
        return (ImageButton) getView(viewId);
    }

    public EditText getEditText(int viewId) {
        return (EditText) getView(viewId);
    }

    public EasyListViewHolder setText(int viewId, String value) {
        TextView view = findViewById(viewId);
        view.setText(value);
        return this;
    }

    public EasyListViewHolder setText(int viewId, CharSequence value) {
        TextView view = findViewById(viewId);
        view.setMovementMethod(LinkMovementMethod.getInstance());
        view.setText(value);
        return this;
    }

    public EasyListViewHolder setBackground(int viewId, int resId) {
        View view = findViewById(viewId);
        view.setBackgroundResource(resId);
        return this;
    }

    public EasyListViewHolder setClickListener(int viewId, View.OnClickListener listener) {
        View view = findViewById(viewId);
        view.setOnClickListener(listener);
        return this;
    }
}
