package br.com.seventh.bookslist.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.seventh.bookslist.BooksListAdapter
import br.com.seventh.bookslist.R
import br.com.seventh.bookslist.api.ApiClient
import br.com.seventh.bookslist.databinding.FragmentHomeBinding
import br.com.seventh.bookslist.model.book.Book
import br.com.seventh.bookslist.model.book.Item
import br.com.seventh.bookslist.utils.Shared

class HomeFragment : Fragment() {
    companion object {
        @JvmStatic
        fun newInstance() = HomeFragment()
    }
    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    private lateinit var recyclerView: RecyclerView
    private lateinit var booksAdapter: BooksListAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root
        recyclerView = root.findViewById(R.id.recyclerViewBooks)

        val textView: TextView = binding.textHome
        homeViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }

        getBooks()
        
        return root
    }

    fun getBooks(){
        ApiClient().getBook(requireContext(),"Dicionário do Espírito Santo",
            {
                val response = it
                Shared.instance.booksList = it
                for(item in response.items!!){
                   Shared.instance.list.add(item)
                }
                initializeAdapter(Shared.instance.list)
            },
            {
                Toast.makeText(requireContext(), "ApiClient().getBook(...) falhou!!", Toast.LENGTH_SHORT).show()
            }
        )
    }

    fun initializeAdapter(newData: MutableList<Item>) {

        recyclerView.layoutManager =
            LinearLayoutManager(requireContext(), RecyclerView.VERTICAL, false)

        booksAdapter = BooksListAdapter(requireContext()) { }

        recyclerView.adapter = booksAdapter
        recyclerView.addItemDecoration(
            DividerItemDecoration(
                requireContext(),
                DividerItemDecoration.VERTICAL
            )
        )
        booksAdapter.setData(newData)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
