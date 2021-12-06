package th.co.dtac.example

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import th.co.dtac.example.databinding.ViewHolderCampaignBinding

/**
 * Created by PrewSitthirat on 2/12/2021 AD.
 */

class CampaignRecyclerAdapter : RecyclerView.Adapter<CampaignRecyclerAdapter.CampaignViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CampaignViewHolder {
        val binding =
            ViewHolderCampaignBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CampaignViewHolder(binding.root)
    }

    override fun onBindViewHolder(holder: CampaignViewHolder, position: Int) {
        holder.bindView(position, itemCount)
    }

    override fun getItemCount(): Int = 5

    inner class CampaignViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        private val binding = ViewHolderCampaignBinding.bind(itemView)

        fun bindView(position: Int, itemCount: Int) {
            binding.space.visibility = if (position == 0) View.VISIBLE else View.GONE
            binding.spaceEnd.visibility =
                if (position < (itemCount - 1)) View.GONE else View.VISIBLE
            binding.layoutRoot.clipToOutline = true
        }
    }
}