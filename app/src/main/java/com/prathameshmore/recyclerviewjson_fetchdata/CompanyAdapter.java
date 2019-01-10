package com.prathameshmore.recyclerviewjson_fetchdata;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class CompanyAdapter extends RecyclerView.Adapter<CompanyAdapter.CompanyViewHolder> {

    private Context context;
    private List<Company> companyList;

    public CompanyAdapter(Context context, List<Company> companyList) {
        this.context = context;
        this.companyList = companyList;
    }

    @NonNull
    @Override
    public CompanyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.companies_layout, viewGroup, false);
        return new CompanyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull CompanyViewHolder companyViewHolder, int i) {
        Company company = companyList.get(i);
        companyViewHolder.companyName.setText(company.getCompanyName());
        companyViewHolder.companyDescription.setText(company.getCompanyDescription());
        companyViewHolder.accountNumber.setText(company.getAccountNumber());

        Picasso.with(context).load(company.getImageURL()).into(companyViewHolder.imageView);

    }

    @Override
    public int getItemCount() {
        return companyList.size();
    }

    class CompanyViewHolder extends RecyclerView.ViewHolder {

        public TextView companyName;
        public TextView companyDescription;
        public TextView accountNumber;
        public ImageView imageView;

        public CompanyViewHolder(@NonNull View itemView) {
            super(itemView);
            companyName = itemView.findViewById(R.id.textViewCompanyName);
            companyDescription = itemView.findViewById(R.id.textViewDescription);
            accountNumber = itemView.findViewById(R.id.textViewAccountNumber);
            imageView = itemView.findViewById(R.id.imageView);
        }


    }

}
