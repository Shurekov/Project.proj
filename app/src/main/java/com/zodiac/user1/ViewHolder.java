package com.zodiac.user1;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {   //  Связывание сообщение с ViewHolder

    TextView message;

    public ViewHolder(View itemView) {
        super(itemView);
        message = itemView.findViewById(R.id.same_message);
    }
}
