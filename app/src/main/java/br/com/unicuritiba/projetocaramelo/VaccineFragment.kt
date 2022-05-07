package br.com.unicuritiba.projetocaramelo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import br.com.unicuritiba.projetocaramelo.databinding.FragmentMenuBinding
import br.com.unicuritiba.projetocaramelo.databinding.FragmentVaccinesBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class VaccinesFragment : Fragment() {

    private var _binding: FragmentVaccinesBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentVaccinesBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}