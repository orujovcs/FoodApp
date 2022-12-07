package com.example.myfoodapp.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.myfoodapp.data.entity.Food
import com.example.myfoodapp.R
import com.example.myfoodapp.databinding.FoodRowStagBinding
import com.example.myfoodapp.ui.fragment.HomeFragmentDirections
import com.example.myfoodapp.ui.viewmodel.HomeFragmentViewModel
import com.example.myfoodapp.utils.doNavigate
import com.example.myfoodapp.utils.showUrlImage


class FoodAdapter(
    var mContext: Context,
    var foodList:List<Food>,
    var viewModel: HomeFragmentViewModel,
    var currentUser: String
)
    : RecyclerView.Adapter<FoodAdapter.FoodViewHolder>(){

    inner class FoodViewHolder(binding: FoodRowStagBinding) : RecyclerView.ViewHolder(binding.root) {
        var binding : FoodRowStagBinding
        init {
            this.binding = binding
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val layoutInflater = LayoutInflater.from(mContext)
        val binding : FoodRowStagBinding = DataBindingUtil.inflate(layoutInflater, R.layout.food_row_stag,parent,false)
        return FoodViewHolder(binding)
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        val food = foodList[position]
        val hb = holder.binding
        hb.foodObject = food
        hb.ivFoodImage.showUrlImage(food.yemek_resim_adi)
        hb.cvFood.setOnClickListener {
            Navigation.doNavigate(it,HomeFragmentDirections.actionHomeFragmentToFoodDetailsFragment(food = food))
        }
    }

    override fun getItemCount(): Int {
        return foodList.size
    }
}