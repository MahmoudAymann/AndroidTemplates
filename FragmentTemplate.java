
    private FragmentActivity mContext;
    ListSharedPreference listSharedPreference;
    private MainViewsCallBack mainViewsCallBack;

    public LoginFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        if (context instanceof FragmentActivity) {
            mContext = (FragmentActivity) context;
        }
        moveToFragment = new MoveToFragment(mContext);
        fireBackButtonEvent();
        super.onAttach(context);
        try {
            mainViewsCallBack = (MainViewsCallBack) context;
        } catch (ClassCastException e) {
            throw new ClassCastException(context.toString() + "error");
        }
        connectionDetector = new ConnectionDetector(context);
        listSharedPreference = new ListSharedPreference(context.getApplicationContext());
        mainViewsCallBack.serToolbarTitle(getString(R.string.products));
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_login, container, false);
        ButterKnife.bind(this,rootView);
        initUI();
        return rootView;
    }

    private void initUI() {

    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onPause() {
        super.onPause();
    }

    @Override
    public void onDetach() 
    {
        mainViewsCallBack = null;
        super.onDetach();
    }
	
	 private void fireBackButtonEvent() {
        try {
            ((MainActivity) Objects.requireNonNull(getActivity())).setOnBackPressedListener(new BaseBackPressedListener(getActivity()) {
                @Override
                public void onBackPressed() {
                    moveToFragment.moveInMain(new HomeFragment());
                }
            });
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }//end back pressed
	
}
